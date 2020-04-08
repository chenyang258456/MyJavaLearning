package com.kkb.innerClass;


// 外部类
public class Demo6 {
	
	// 静态内部类
	static class InDemo5 {
		private static int age1 = 20;
		private int age2 = 10;
	}
	
	public void getInnerProperty() {
		
		System.out.println(InDemo5.age1);
		
		System.out.println(new InDemo5().age2);
	}
	
}
