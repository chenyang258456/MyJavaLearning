package com.kkb.Demo02;

public class Demo5 {
	private String userName;
	private int age;
	
	public Demo5() {
		System.out.println("无参数构造器");
	}
	
	public Demo5(String userName){
		System.out.println("有参数构造器");
		this.userName = userName;
	}
	public Demo5(String userName,int age) {
		System.out.println("有参数构造器");
		this.userName = userName;
		this.age = age;
	}
	public static void main(String[] args) {
		Demo5 d = new Demo5();
		Demo5 d2 = new Demo5("chenyang");
		Demo5 d3 = new Demo5("chenyang",19);
		System.out.println(d2.age);
		System.out.println(d3.userName+d3.age);
	}


}
