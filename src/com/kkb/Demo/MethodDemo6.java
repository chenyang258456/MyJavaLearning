package com.kkb.Demo;

public class MethodDemo6 {
	public static int f(int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 4;
		}else {
			return 2*f(n-1) + f(n-2);
		}
	}
	public static void main(String[] args) {
		int result = f(10);
		System.out.println(result);
	}
}
