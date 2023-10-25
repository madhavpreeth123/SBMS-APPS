package com.madhav.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ListEmp {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(101,"MADHAV","MANAGER",25,"MALE"));
		emp.add(new Employee(102,"ASHOK","HR",26,"MALE"));
		emp.add(new Employee(103,"CHANDINI","TESTING",25,"FEMALE"));
		emp.add(new Employee(104,"NIRAMALA","MANAGER",25,"FEMALE"));
		
		Map<String, Long> collect = emp.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		System.out.println(collect);
		
		Map<String, Long> collect2 = emp.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		
		System.out.println(collect2);
		Map<String, Long> collect3 = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(collect3);
		
		Map<String,Integer> map=new HashMap<>();
		for(Employee e: emp) {
			if(map.containsKey(e.getName())) {
				map.put(e.getName(), map.get(e.getName())+1);
			}
			else {
				map.put(e.getName(),1);
			}
		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		entrySet.forEach(i-> System.out.println(i));
	}
}
