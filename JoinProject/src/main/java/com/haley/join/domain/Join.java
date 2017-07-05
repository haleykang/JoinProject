package com.haley.join.domain;

import java.sql.Date;

public class Join {
	
	// 파라미터 처리 방법 : Command 방식으로 값 주고 받기
	
	// 1. 변수 
	private String email;
	private String pw;
	private String dname;
	private Date dbirth;
	
	// 2. get, set 함수
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
	
	// 3. toString함수
	@Override
	public String toString() {
		return "Join [email=" + email + ", pw=" + pw + ", dname=" + dname + ", dbirth=" + dbirth + "]" +"\n";
	}
	
	
	

}
