package com.lk.student;

public class Student {

	private String sname;
	private String address;
	private long phone_no;
	private int rollno;

	public Student(String sname, String address, long phone_no, int rollno) {
		super();
		this.sname = sname;
		this.address = address;
		this.phone_no = phone_no;
		this.rollno = rollno;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
}
