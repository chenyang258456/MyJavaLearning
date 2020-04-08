package com.kkb.Demo;
class Apple{
	int a;
	int b;
}

public class MethodDemo4 {
	public static void change(Apple apple) {
		int tmp = apple.a;
		apple.a = apple.b;
		apple.b = tmp;
		System.out.println("在 change() 方法中  a 的值：" + apple.a + " b 的值：" + apple.b);
	}
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.a = 5 ;
		apple.b = 6;
		change(apple);
		System.out.println("在 change() 方法中  a 的值：" + apple.a + " b 的值：" + apple.b);

	}
}