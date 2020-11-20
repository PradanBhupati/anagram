package com.bm.practice;

import java.awt.geom.Arc2D;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class cloudJump {

	static int jumpingOnClouds(int[] c) {
		int k=0;
		int count=0;
		int res=0;
		List<Integer> arrCnt=new ArrayList<Integer>();
		for (int i = 0; i < c.length; i++) {
			
			int comp1=c[i];
			if(comp1==0) {
				count++;
			}
			if(comp1==1) {
				res=res+count/2+1;
				count=0;
			}
			if(comp1==0 && i==c.length-1) {
				res=res+count/2;
				count=0;
			}
			
			
			
		}

		return res;
	}
	public static void main(String[] args) {
		int[] c= {0 ,0 ,0 ,1 ,0 ,0};
		System.out.println(jumpingOnClouds(c));
	}

}




/*
 static int jumpingOnClouds(int[] c) {
		int k=0;
		int count=0;
		List<Integer> arrCnt=new ArrayList<Integer>();
		for (int i = 0; i < c.length; i++) {

			int comp1=c[i];
			if(comp1!=9) {
				for (int j = 0; j < c.length; j++) {
					int comp2=c[j];
					if(comp1==comp2) {
						count++;
						c[j]=9;
					}
					else {
						arrCnt.add(count);
						arrCnt.add(1);
						count=0;
						c[j]=9;
					}		
				}
			}
		}
		arrCnt.add(count);
		for (Integer in:  arrCnt) {
			int num = in.intValue();
			if(num==1) 
				k=k+1;
			else
				k=k+num/2;
		}
		return k;
	}
*/
