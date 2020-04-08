package com.kkb.classdemo;

public class User {
	public static void main(String[] args) {
		
		ClassDemo cd = new ClassDemo("EnglishName");
		cd.setAge(15);
		cd.setName("haha");
		String name = cd.getName();
		int age = cd.getAge();
		cd.eat("banana");
		ClassDemo.demo();
		System.out.println(name + " is " + age + " years old!");
		System.out.println(cd.myName);
		
	}
}
