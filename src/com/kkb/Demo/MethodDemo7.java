package com.kkb.Demo;

public class MethodDemo7 {
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("这是 abdc()方法");
	}
	public void abc(int a) {
		System.out.println("这是 abdc()方法  a: " + a);
	}
	public void abc(int a,int b) {
		System.out.println("这是 abdc()方法  a: " + a + " b: "+b);
	}
	public static void main(String[] args) {
		MethodDemo7 md = new MethodDemo7();
		md.abc();
		md.abc(5);
		md.abc(5, 4);
	}
}
