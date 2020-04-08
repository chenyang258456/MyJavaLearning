package com.kkb.Demo;

public class MethodDemo3 {
	public static void change(int a,int b) {
		// TODO Auto-generated method stub
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("在 change()方法中，a的值 "+a+" b的值 "+b);
	}
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		change(a,b);
		System.out.println("在 change()方法中，a的值 "+a+" b的值 "+b);
	}
}
