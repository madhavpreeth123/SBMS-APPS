package com.madhav.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesinList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.addAll(Arrays.asList(1,2,3,4,2,4));
		
		Set<Integer> set=new HashSet<>();
		
//	for(Integer el: al) {
//		if(set.add(el)) {
//			
//		}
//		else {
//			System.out.println(el);
//		}
//		
//	}
	
	al.stream().filter(i -> !set.add(i)).forEach(i -> System.out.println(i));
		
		
	}
}
