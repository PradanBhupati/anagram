package com.nt.practice;

public class RevString {

	public String reverse(String input) {
		StringBuffer output=new StringBuffer();
		char[] ch = input.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			output.append(ch[i]);
		}
		return output.toString();
	}
	public static void main(String[] args) {
		String input="123";
		RevString rv=new RevString();
		String reverse = rv.reverse(input);
		System.out.println(reverse);
	}
}
