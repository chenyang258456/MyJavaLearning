package com.kkb.classdemo;

public class ThisDemo {
	public static void eat() {
		// TODO Auto-generated method stub
		System.out.println("���˸�������");
	}
	public static void run() {
		System.out.println("�����ң���Ҫ�ܲ�����");
		ThisDemo.eat();
	}
	public static void main(String[] args) {
		ThisDemo.run();
	}
}
