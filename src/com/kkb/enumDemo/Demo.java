package com.kkb.enumDemo;

public class Demo {
	
	public void abc(Season s) {
		
		switch(s) {
			case SPRING:
				System.out.println("春暖花开");
				break;
			case SUMMER:
				System.out.println("夏日炎炎");
				break;
			case FALL:
				System.out.println("秋高气爽");
				break;
			case WINTER:
				System.out.println("冷死个人");
				break;
		}
	}
	
	public static void main(String[] args) {
		
		for (Season s : Season.values()) {
			
			System.out.println(s);
		}
		
		new Demo().abc(Season.WINTER);
	}
}
