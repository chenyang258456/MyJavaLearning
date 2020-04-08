package com.kkb.innerClass;

// 外部类
class OutClass2 {
	
	// 内部类
	static class InnerClass2 {
		
		// 构造器
		public InnerClass2() {
			System.out.println("内部类的构造器");
		}
	}
}


public class Demo8 {
	
	public static void main(String[] args) {
		
		OutClass2.InnerClass2 in = new OutClass2.InnerClass2();
		
	}
	
}
