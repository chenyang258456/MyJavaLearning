package com.kkb.Demo02;

public class Demo3 {
	//定义实例变量
	private String userName;
	private static double money = 100.0;
	
	public void sayHello() {
		// TODO Auto-generated method stub
		String userName = "冰哥";
		System.out.println(userName);
		System.out.println(this.userName);
	}
	
	public static void main(String[] args) {
		double money = 18.0;
		System.out.println(Demo3.money);
		new Demo3().sayHello();
	}
}
