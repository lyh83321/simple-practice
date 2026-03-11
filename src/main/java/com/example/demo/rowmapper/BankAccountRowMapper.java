package com.example.demo.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.BankAccountDemo;

public class BankAccountRowMapper implements RowMapper<BankAccountDemo> {

	@Override
	public BankAccountDemo mapRow(ResultSet rs, int rowNum) throws SQLException {
		BankAccountDemo bank = new BankAccountDemo();
		bank.setId(rs.getInt("id"));
		bank.setIdentity_id(rs.getString("identity_id"));
		bank.setBANK_NO(rs.getInt("BANK_NO"));
		bank.setBANK_CODE(rs.getInt("BANK_CODE"));
		bank.setAmount(rs.getInt("Amount"));
		bank.setActivity(rs.getString("Activity"));
//		bank.setCreate_time(rs.getDate(null));
//		bank.setUpdate_time(rs.getDate(null));
		
		return bank;
	}
}
