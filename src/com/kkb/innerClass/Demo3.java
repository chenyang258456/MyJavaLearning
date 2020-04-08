package com.kkb.innerClass;


// 外部类
public class Demo3 {
	
	// 非静态内部类
	private class InDemo3{}
	
	public static void main(String[] args) {
		
		// 能否调用？
		// 静态方法中，不能调用非静态成员
		// new InDemo3();
	}
}
