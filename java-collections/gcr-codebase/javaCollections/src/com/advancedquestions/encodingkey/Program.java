package com.advancedquestions.encodingkey;

import java.util.Scanner;

public class Program {
	
	public static StringBuilder reverseAndUppercase(StringBuilder withoutascii) {
		withoutascii.reverse();
		for(int i=0; i<withoutascii.length(); i++) {
			if(i%2==0) {
				withoutascii.setCharAt(i, (char) (withoutascii.charAt(i)-32));
			}
		}
	return	withoutascii;
	}
	
	public static StringBuilder removeEvenAsciiCharacters(String lower) {
		StringBuilder withoutEvenAscii = new StringBuilder();
		for(int i= 0; i<lower.length(); i++) {
			if(lower.charAt(i)%2!=0) {
				withoutEvenAscii.append(lower.charAt(i));
			}
			else {
				continue;
			}
		}
		return withoutEvenAscii;
	}
	
	public String CleanseAndInvent(String input) {
		if(!input.matches("^[a-zA-Z]+$")) {
			return "Input contains special characters ";
		}
		else if(input.length()<6) {
			return "The length is less than 6 characters ";
		}
		else {
			String lower = input.toLowerCase();
			
			StringBuilder withoutascii =removeEvenAsciiCharacters(lower);
			
			return 	reverseAndUppercase(withoutascii).toString();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a String : ");
		String input = sc.nextLine();
		Program p = new Program();
		System.out.println(p.CleanseAndInvent(input));
		
	}

	

}
