package com.madhav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	
	public static void main(String[] args) {
		
		/*ArrayList<Integer> nums=new ArrayList<>();
		nums.add(30);
		nums.addAll(Arrays.asList(32,45,10,20,24,17));*/
		
		/*Stream<Integer> stream=nums.stream();
		Stream<Integer> filtered=stream.filter(i -> i>20);
		filtered.forEach(i -> System.out.println(i)); */
		
		//nums.stream().filter(i -> i%2!=0).forEach(i ->System.out.println(i));
		
		List<String> names=new ArrayList<>();
		names.addAll(Arrays.asList("America","Australia","Canada","Europe","Asia"));
		names.stream().filter(name -> name.startsWith("A")&& name.endsWith("a")).forEach(name ->System.out.println(name));
		
	}
}
