package com.kkb.enumDemo;

public class User2Demo {

	public static void main(String[] args) {
		
		User2 user = User2.valueOf("boy");
		user.setUserName("郭漂亮");
		System.out.println(user + "--" + user.getUserName());
		user.setUserName("帅帅");
		System.out.println(user + "--" + user.getUserName());
		
	}
}
