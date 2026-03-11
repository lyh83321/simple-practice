package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import oracle.sql.DATE;

@Entity
@Table(name="BANKACCOUNT_DEMO")
public class BankAccountDemo {

	private int id;
	
	private String identity_id;
	
	private int BANK_NO;
	
	private int BANK_CODE;
	
	private DATE create_time;
	
	private String create_user;
	
	private DATE update_time;
	
	private String update_user;
	
	private String Activity;
	
	private double Amount;
	
	private int PASSWORD;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentity_id() {
		return identity_id;
	}

	public void setIdentity_id(String identity_id) {
		this.identity_id = identity_id;
	}

	public int getBANK_NO() {
		return BANK_NO;
	}

	public void setBANK_NO(int bANK_NO) {
		BANK_NO = bANK_NO;
	}

	public int getBANK_CODE() {
		return BANK_CODE;
	}

	public void setBANK_CODE(int bANK_CODE) {
		BANK_CODE = bANK_CODE;
	}

	public DATE getCreate_time() {
		return create_time;
	}

	public void setCreate_time(DATE create_time) {
		this.create_time = create_time;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public DATE getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(DATE update_time) {
		this.update_time = update_time;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public String getActivity() {
		return Activity;
	}

	public void setActivity(String activity) {
		Activity = activity;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public int getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(int pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
	@Override
	public String toString() {
		return identity_id;
	}
}
