package com.madhav.strings;

import java.util.Arrays;

public class StringOperations {
	public static void main(String[] args) {
		String name="hello";
		StringBuilder sb=new StringBuilder(name);
		System.out.println(sb.reverse());
		
		//Replace special characters
		String special="$#%j&*a@va";
		String res=special.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(res);
		
		//Replace white spaces
		String whiteSpac=" j a  v  a ";
		String res2=whiteSpac.replaceAll("\\s", "");
		System.out.println(res2);
		
		
	}

}
