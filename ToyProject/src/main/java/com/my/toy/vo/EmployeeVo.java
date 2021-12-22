package com.my.toy.vo;

import java.util.Date;

public class EmployeeVo {

	private int no;
	private String name;
	private String age;
	private String status;
	private String gender;
	private String birth;
	private String department;
	private Date join_date;
	
	public EmployeeVo() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeVo(int no, String name, String age, String status, String gender, String birth, String department,
			Date join_date) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.status = status;
		this.gender = gender;
		this.birth = birth;
		this.department = department;
		this.join_date = join_date;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
}
