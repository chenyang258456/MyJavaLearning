package com.kkb.innerClass;

public class Demo9 {
	
	public static void main(String[] args) {
		
		// 定义局部内部类
		class JuInner {
			int age;
		}
		
		// 定义局部内部类的子类
		class JuInnerChild extends JuInner {
			int money;
		}
		
		// 初始化内部类的子类
		JuInnerChild jc = new JuInnerChild();
		
		jc.age = 18;
		jc.money = 10000;
		
		System.out.println("age--->" + jc.age + "  money--->" + jc.money);
		
	}
	
}
