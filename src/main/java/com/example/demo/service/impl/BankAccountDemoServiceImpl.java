package com.example.demo.service.impl;

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
}
