package com.madhav.program;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		String sent="statistics";
		System.out.println(getUniqueLetters(sent));
		
	}
	public static int getUniqueLetters(String sent) {
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<sent.length();i++) {
			
			/*if(hm.containsKey(sent.charAt(i))) {
				hm.put(sent.charAt(i),hm.get(sent.charAt(i))+1);
			}
			else {
				hm.put(sent.charAt(i),1);
			}*/
			
			hm.put(sent.charAt(i),hm.getOrDefault(sent.charAt(i),0)+1);
			
		}
		char u=sent.charAt(0);
		boolean status=false;
		for(Map.Entry<Character,Integer> e:hm.entrySet()) {
		
		if(e.getValue()==1) {
			status=true;
			u=e.getKey();
			break;
		}
	}
		if(status) {
			return sent.indexOf(u)+1;
		}
		else
		{
			return -1;
		}

}
}
