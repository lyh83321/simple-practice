package com.example.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BankAccountDemoDao;
import com.example.demo.model.BankAccountDemo;
import com.example.demo.rowmapper.BankAccountRowMapper;

@Component
public class BankAccountDemoDaoImpl implements BankAccountDemoDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public BankAccountDemo getBankById(Integer bankId) {
		String sql = "SELECT * FROM BANKACCOUNT_DEMO WHERE id = :bankId";
		Map<String, Object> map = new HashMap<>();
		map.put("bankId", bankId);
		
//		RowMapper<BankAccountDemo> bankMapper = RowMapper<rowMapper>{};
		
		List<BankAccountDemo> bankList = namedParameterJdbcTemplate.query(sql, map, new BankAccountRowMapper());

		if (bankList.size() > 0) {
			return bankList.get(0);
		} else {
			return null;
		}
	}
	
}
