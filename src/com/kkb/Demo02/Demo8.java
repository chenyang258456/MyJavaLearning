package com.kkb.Demo02;

class Animal2{
	public int age = 10;
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("这里有不懂事的动物，再看，再看就咬你。。。");
	}
}

class Dog extends Animal2{
	public int age = 18;
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("这里有不懂事的狗，再看，再看就咬你。。。");
	}
	
}

public class Demo8 extends Animal2{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
	}
}
