package com.example.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BankAccountDemoDao;
import com.example.demo.model.BankAccountDemo;
import com.example.demo.rowmapper.BankAccountRowMapper;

@Component
public class BankAccountDemoDaoImpl implements BankAccountDemoDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static final SessionFactory SESSION_FACTORY;
	
	/**
	 * Initialize the SessionFactory instance.
	 */
	static {
		// Create a Configuration object.
		Configuration config = new Configuration();
		// Configure using the application resource named hibernate.cfg.xml.
		config.addAnnotatedClass(com.example.demo.mapping.hibernate.BankAccountDemo.class);
		config.configure();
		// Extract the properties from the configuration file.
		Properties prop = config.getProperties();

		// Create StandardServiceRegistryBuilder using the properties.
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(prop);

		// Build a ServiceRegistry
		StandardServiceRegistry registry = builder.build();

		// Create the SessionFactory using the ServiceRegistry
		SESSION_FACTORY = config.buildSessionFactory(registry);
		
	}
	
	@Override
	public BankAccountDemo getBankById(Integer bankId) {
		String sql = "SELECT * FROM BANKACCOUNT_DEMO WHERE id = :bankId";
		Map<String, Object> map = new HashMap<>();
		map.put("bankId", bankId);
		
		
		List<BankAccountDemo> bankList = namedParameterJdbcTemplate.query(sql, map, new BankAccountRowMapper());

		if (bankList.size() > 0) {
			return bankList.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	public List<com.example.demo.mapping.hibernate.BankAccountDemo> readAll() {
		List<com.example.demo.mapping.hibernate.BankAccountDemo> bankAccountDemos = null;
		// Create a session
		Session session = SESSION_FACTORY.openSession();
		Transaction transaction = null;
		try {
			// Begin a transaction
			transaction = session.beginTransaction();
			bankAccountDemos = session.createQuery("FROM BankAccountDemo").list();
			// Commit the transaction
			transaction.commit();
		} catch (HibernateException ex) {
			// If there are any exceptions, roll back the changes
			if (transaction != null) {
				transaction.rollback();
			}
			// Print the Exception
			ex.printStackTrace();
		} finally {
			// Close the session
			session.close();
		}
		return bankAccountDemos;
	}
}
