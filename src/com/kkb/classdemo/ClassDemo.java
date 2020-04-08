package com.kkb.classdemo;

public class ClassDemo {
	public String name;
	public int age;
	public static String myName = "chen";
	public static void demo() {
		System.out.println("just say hello");
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ClassDemo() {
		System.out.println("我是ClassDemo类");
	}
	public ClassDemo(String EnglishName) {
		System.out.println("My "+EnglishName+" is "+this.myName);
	}
	
	public void eat(String food) {
		System.out.println(this.name + "吃了" + food);
		
	}

}

