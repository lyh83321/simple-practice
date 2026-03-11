package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import oracle.sql.DATE;

@Entity
@Table(name="PERSON_DEMO")
public class PersonDemo {

	private int id;
	
	private String name;
	
	private String identity_id;
	
	private DATE birthday;
	
	private int age;
	
	private int address_no;
	
	private String cellphone;
	
	private String home_number;
	
	private DATE create_time;
	
	private String create_user;
	
	private DATE update_time;
	
	private String update_user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentity_id() {
		return identity_id;
	}

	public void setIdentity_id(String identity_id) {
		this.identity_id = identity_id;
	}

	public DATE getBirthday() {
		return birthday;
	}

	public void setBirthday(DATE birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAddress_no() {
		return address_no;
	}

	public void setAddress_no(int address_no) {
		this.address_no = address_no;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getHome_number() {
		return home_number;
	}

	public void setHome_number(String home_number) {
		this.home_number = home_number;
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
	
	@Override
    public String toString() {
		return identity_id;
	}
}
