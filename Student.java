package com.Student.manage;

public class Student {
	
	private int id;
	private String studentname;
	private String studentphone;
	private String studentcity;
	public Student(int id, String studentname, String studentphone, String studentcity) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	public Student(String studentname, String studentphone, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", studentphone=" + studentphone
				+ ", studentcity=" + studentcity + "]";
	}
	
	

}
