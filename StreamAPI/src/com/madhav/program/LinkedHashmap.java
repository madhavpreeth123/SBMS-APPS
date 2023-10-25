package com.madhav.program;

import java.util.LinkedHashMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		
		String s="statistics";
		LinkedHashMap<Character, Integer> lm=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			if(lm.containsKey(s.charAt(i))) {
				lm.put(s.charAt(i), lm.get(s.charAt(i))+1);
			}
			else {
				lm.put(s.charAt(i), 1);
			}
		}
		System.out.println(lm);
	}
}
