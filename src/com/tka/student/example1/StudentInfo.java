package com.tka.student.example1;

public class StudentInfo {
	private int student_id;
	private String student_name;
	private String student_phone;
	private String student_city;
	private String student_email;
	
	public StudentInfo()
	{
		
	}
	public StudentInfo(int student_id , String student_name , String student_phone , String student_city , String student_email)
	{
		this.student_id=student_id;
		this.student_name=student_name;
		this.student_phone=student_phone;
		this.student_city=student_city;
		this.student_email=student_email;
	}
	public StudentInfo(String student_name , String student_phone , String student_city , String student_email)
	{
	
		this.student_name=student_name;
		this.student_phone=student_phone;
		this.student_city=student_city;
		this.student_email=student_email;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudent_city() {
		return student_city;
	}
	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	@Override
	public String toString() {
		return "StudentInfo [student_id=" + student_id + ", student_name=" + student_name + ", student_phone="
				+ student_phone + ", student_city=" + student_city + ", student_email=" + student_email + "]";
	}
	
	

}
