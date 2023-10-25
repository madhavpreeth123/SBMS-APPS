package com.madhav.user;

public class User {
	
	String name;
	int age;
	
	User(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
	
		return "user[name="+name+"age="+age+"]";
	}

}
