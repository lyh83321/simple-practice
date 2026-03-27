package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.BankAccountDemo;

@Service
public interface BankAccountDemoService {

	BankAccountDemo getBankAccountById(Integer bankId);

	List<com.example.demo.mapping.hibernate.BankAccountDemo> readAll();
}
