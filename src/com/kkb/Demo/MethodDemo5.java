package com.kkb.Demo;

public class MethodDemo5 {
	public static void change(int a,int b,String...names) {
		for (String name : names) {
			System.out.println("name的值： "+name);
		}
		
	}
	public static void main(String[] args) {
		change(1,2,"hehe","haha");
	}
}
