package com.madhav.user;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private int age;
	private String gender;
	
	
	public Employee(int id, String name, String dept, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
