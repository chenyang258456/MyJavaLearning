package com.kkb.Demo02;

class Father{
	public String userName;
	public double money;
	
	public Father(String userName,double money) {
		this.userName = userName;
		this.money = money;
	}
}

public class Demo6 extends Father {
	public String work;
	public Demo6(String work,String userName,double money) {
		super(userName,money);
		this.work = work;
	}
	public static void main(String[] args) {
		Demo6 d = new Demo6("厨师","晨阳",180.0);
		System.out.println(d.userName);
	}
}
