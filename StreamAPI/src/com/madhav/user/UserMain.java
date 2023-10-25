package com.madhav.user;

import java.util.stream.Stream;

public class UserMain {

	public static void main(String[] args) {
	
		User u1=new User("John",20);
		User u2=new User("Charles",18);
		User u3=new User("Keamo",30);
		User u4=new User("Sam",24);
		User u5=new User("Robert",17);
		User u6=new User("Indila",27);
		Stream.of(u1,u2,u3,u4,u5,u6).filter(u -> u.age>18).map(u -> u.name.toUpperCase()).forEach(u -> System.out.println(u));
}

}
