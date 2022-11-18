package com.service;

public class ReverseServiceImpl implements ReverseService {

	public String ReverseOrder(String originalString) {
		char ch;
		String reversestring="";
		for (int i=0; i<originalString.length(); i++)
	      {
	        ch= originalString.charAt(i); 
	        reversestring= ch+reversestring; 
	      }
	      System.out.println("Reversed word: "+ reversestring);
		return reversestring;
		
	}

}
