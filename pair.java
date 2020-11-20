package com.bm.practice;

import java.util.Arrays;
import java.util.List;

public class pair {


	public static int findPair(int n, int[] ar) {
		
		int pair=0;
		for(int i=0;i<=n-1;i++) {
			int count=0;
			int comp1=ar[i];
			if(ar[i]!=0) {
				for(int j=0;j<=n-1;j++) {
					int comp2=ar[j];
					if(comp1==comp2) {
						ar[j]=0;
						count++;
					}
				}
				pair=pair+count/2;
				
			}//if(ar[i]!=0)
		}
		
		return pair;
	}


	public static void main(String[] args) {
		int[] ar= {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int n=9;

		System.out.println(findPair(n,ar));
	}

}
