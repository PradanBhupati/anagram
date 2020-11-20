package com.nt.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class anagramSort {

	public static String sort(String comp1) {
		//StringBuilder s=new StringBuilder(); 
		char charArray[] = comp1.toCharArray();
		//s.append(Character.toUpperCase(comp1.charAt(0)));
		//System.out.println(s);
		Arrays.sort(charArray);
		String comp2=new String(charArray);
		//System.out.println(comp2+"++++");
		return comp2;
	}
	public static void find(String[] str) {
		int k=0;
		List<String>  str1=Arrays.asList(str);
		if(str1.isEmpty()) {
			System.out.println("empty array");
		}
		else {
			for (int i= 0;i<str1.size()-1;) {
				List<String> newStr=new ArrayList<String>();
				List<String>  eqStr=new ArrayList<String>();
				String comp1=str1.get(i);
				String sort1 = sort(comp1);
				for (int j=i ;j<=str1.size()-1;j++) {
					String comp2=str1.get(j);
					String sort2 = sort(comp2);
					if(sort1.equals(sort2))
						eqStr.add(comp2);
					else {
						newStr.add(comp2);
					}
				}
				str1=newStr;
				System.out.println(eqStr);
			}
		}
	}
	public static void main(String[] args) {
		String[] str={"cba","bca","fgd","tkd","dfg","cab","aabc"};
		find(str);
	}
}
