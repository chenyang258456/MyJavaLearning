package com.kkb.enumDemo;

public class UserDemo {

	public static void main(String[] args) {
		
		// 获取指定的枚举类的枚举值
		User user = Enum.valueOf(User.class, "girl");
		
		user.userName = "班班";
		
		System.out.println(user + "--" + user.userName);
	}
}
