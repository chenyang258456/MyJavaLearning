package com.kkb.classdemo;

public class ThisDemo {
	public static void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃了个大西瓜");
	}
	public static void run() {
		System.out.println("别拦我，我要跑步减肥");
		ThisDemo.eat();
	}
	public static void main(String[] args) {
		ThisDemo.run();
	}
}
