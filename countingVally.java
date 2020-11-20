package com.bm.practice;

import java.util.Arrays;

public class countingVally {

	public static int countingValleys(int steps, String path) {
		int[] dtl=new int[steps];
	    int level=0;
		for(int i=0;i<steps;i++) {
			String alph = String.valueOf(path.charAt(i));
			if(alph.equalsIgnoreCase("U")) {
				level=level+1;
				dtl[i]=level;
			}
			if(alph.equalsIgnoreCase("D")) {
				level=level-1;
				dtl[i]=level;
			}
		}
		return dtl[0]-dtl[dtl.length-1];
	    }
	
	public static void main(String[] args) {
		String path="UDUUUDUDDD";
		System.out.println(countingValleys(10, path));
		System.out.println();
	}
}
