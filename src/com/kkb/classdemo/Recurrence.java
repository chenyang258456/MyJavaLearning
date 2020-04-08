package com.kkb.classdemo;

public class Recurrence {
	public static void main(String[] args) {
		int num = recurrence(7);
		System.out.println(num);
	}
	
	public static int recurrence(int i) {
		if (i==0) {
			return 0;
			
		}else if (i == 1) {
			return 1;		
		}else {
			return recurrence(i-1) + recurrence(i-2);
		}
		
	}

}
