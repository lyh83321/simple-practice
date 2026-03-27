package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.BankAccountDemo;

public interface BankAccountDemoDao {

	BankAccountDemo getBankById(Integer bankId);
	
	List<com.example.demo.mapping.hibernate.BankAccountDemo> readAll();
	
}
