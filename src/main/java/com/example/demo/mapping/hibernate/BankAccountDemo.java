package com.example.demo.mapping.hibernate;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import oracle.sql.DATE;

@Entity
@Table(name="BANKACCOUNT_DEMO")
public class BankAccountDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "identity_id")
	private String identity_id;
	
	@Column(name = "BANK_NO")
	private int BANK_NO;
	
	@Column(name = "BANK_CODE")
	private int BANK_CODE;
	
	@Column(name = "create_time")
	private Timestamp create_time;
	
	@Column(name = "create_user")
	private String create_user;
	
	@Column(name = "update_time")
	private Timestamp update_time;
	
	@Column(name = "update_user")
	private String update_user;
	
	@Column(name = "Activity")
	private String Activity;
	
	@Column(name = "Amount")
	private double Amount;
	
	@Column(name = "PASSWORD")
	private String PASSWORD;

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

	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public Timestamp getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Timestamp update_time) {
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

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
}
