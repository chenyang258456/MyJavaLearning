package com.kkb.Demo02;

class Animal{
	public double weight;
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("我是一个动物，我有 "+weight+" 斤重！");
	}
}
class BanBan extends Animal{
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
//		super.sayHello();
		System.out.println("我是一个班班，我有 "+weight+" 斤重！");
	}
}
public class Demo7 extends Animal {
	public static void main(String[] args) {
		Animal a = new BanBan();
		a.weight = 180.0;
		a.sayHello();
	}
}
