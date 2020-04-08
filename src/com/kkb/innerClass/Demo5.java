package com.kkb.innerClass;


// 外部类
public class Demo5 {
	
	// 字段
	private int age1 = 18;
	private static int money = 100;
	
	// 静态内部类
	static class InDemo5 {
		
		private static int age2 = 20;
		
		// 方法
		public void getOutProperty() {
			 
			// System.out.println(age1);
			
			// 可以访问静态变量
			System.out.println(money);
		}
		
	}
}
