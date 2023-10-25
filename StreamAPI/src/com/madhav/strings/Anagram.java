package com.madhav.strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	String str1="tet";
	String str2="tet";
	
	boolean anagram=areAnagrams(str1, str2);
	if(anagram) {
		System.out.println("String are anagaram");
	}
	else {
		System.out.println("not anagram");
	}
	}
	
	public static boolean areAnagrams(String str1,String str2) {
		
		char[] strChar1 = str1.toCharArray();
		char[] strchar2=str2.toCharArray();
		Arrays.sort(strChar1);
		Arrays.sort(strchar2);
		if(str1.length()!=str1.length()) {
			return false;
		}
		if(!Arrays.equals(strChar1, strchar2)) {
			return false;
		}
		return true;
		
	}
	
	
}
