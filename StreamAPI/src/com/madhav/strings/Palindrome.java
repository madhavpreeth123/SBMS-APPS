package com.madhav.strings;

public class Palindrome {

	public static void main(String[] args) {
		String str="helo";
		boolean palindrome = isPalindrome(str);
		if(palindrome) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
			return false;	
			}
			
		left++;
		right--;
		
		}
		return true;
		
	}
}
