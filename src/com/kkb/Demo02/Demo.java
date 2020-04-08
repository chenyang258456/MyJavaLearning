package com.kkb.Demo02;
class User{
	public String userName;
	public static int gold;
}
public class Demo {
	public static void main(String[] args) {
		System.out.println(User.gold);
		User user = new User();
		String name = user.userName;
		int gCount = user.gold;
		System.out.println(name + " --- "+gCount);
		user.userName = "班班";
		user.gold = 180;
		System.out.println(user.userName + " --- "+user.gold);
	}

}
