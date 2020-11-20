package com.bm.practice;

public class repeatedString {

	static long repeatedString(String s, long n) {
		StringBuffer sb=new StringBuffer();
		//if(sb.length()<=n+s.length()) {
		for (int i = 0; i <= n/s.length(); i++) {
			sb.append(s);
		}
		//}
		System.out.println(s.length());
		int count=0;
		for (int i = 0; i < n; i++) {
			String comp=String.valueOf(sb.charAt(i));
			if(comp.equalsIgnoreCase("a"))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String s="a";
		long n=1000000000000L;
//		String s="aba";
//		long n=10;
		System.out.println(repeatedString(s, n));
	}
}
