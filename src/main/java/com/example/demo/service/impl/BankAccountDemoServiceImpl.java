package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BankAccountDemoDao;
import com.example.demo.model.BankAccountDemo;
import com.example.demo.service.BankAccountDemoService;

@Component
public class BankAccountDemoServiceImpl implements BankAccountDemoService {

	@Autowired
	private BankAccountDemoDao bankAccountDemoDao;
	
	@Override
	public BankAccountDemo getBankAccountById(Integer bankId) {
        return bankAccountDemoDao.getBankById(bankId);
    }
	
	@Override
	public List<com.example.demo.mapping.hibernate.BankAccountDemo> readAll() {
        return bankAccountDemoDao.readAll();
    }
}
