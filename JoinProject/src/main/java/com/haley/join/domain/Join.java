package com.haley.join.domain;

import java.sql.Date;

public class Join {
	
	// �Ķ���� ó�� ��� : Command ������� �� �ְ� �ޱ�
	
	// 1. ���� 
	private String email;
	private String pw;
	private String dname;
	private Date dbirth;
	
	// 2. get, set �Լ�
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Date getDbirth() {
		return dbirth;
	}
	public void setDbirth(Date dbirth) {
		this.dbirth = dbirth;
	}
	
	// 3. toString�Լ�
	@Override
	public String toString() {
		return "Join [email=" + email + ", pw=" + pw + ", dname=" + dname + ", dbirth=" + dbirth + "]" +"\n";
	}
	
	
	

}
