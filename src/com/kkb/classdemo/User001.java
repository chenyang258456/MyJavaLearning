package com.kkb.classdemo;

public class User001 {
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃了个大西瓜");
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("别拦我，我要跑步减肥");
//		User001 user = new User001();
		this.eat();
		User001.jump();
		
	}
	public static void jump() {
		System.out.println("I can fly so far away!");
	
	}

}
