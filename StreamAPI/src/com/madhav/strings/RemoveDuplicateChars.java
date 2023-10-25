package com.madhav.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		
//		//Approach-1
//		String name="aabbaccdef";
//		StringBuilder sb1=new StringBuilder();
//			name.chars().distinct().forEach(c -> sb1.append((char)c));
//			System.out.println(sb1);
			
		//Approach-2
		String name="aabbaccdef";
			char[] arr=name.toCharArray();
			StringBuilder sb2=new StringBuilder();
			for(int i=0;i<arr.length;i++) {
				boolean flag=false;
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]==arr[j]) {
						flag=true;
						
					}
				}
				if(!flag) {
					sb2.append(arr[i]);
				}
			}
			System.out.println(sb2);
		
			//Approach-3
			Set<Character> set=new HashSet<>();
			StringBuilder sb3=new StringBuilder();
			for(int i=0;i<name.length();i++) {
				set.add(name.charAt(i));
			}
			for(Character c:set) {
				sb3.append(c);
				}
			System.out.println(sb3);
	}
}
