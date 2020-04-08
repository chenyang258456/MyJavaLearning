package com.kkb.innerClass;


// 外部类
public class Demo2 {
	
	// 私有变量
	private int abc = 10;
	
	// 内部类
	class InDemo2 {
		
		// 私有变量
		private int inabc = 18;
		
		public void getOutProperty() {
			// 访问外部类的变量
			// System.out.println(Demo2.this.abc);
			System.out.println("获取外部类中的变量：" + abc);
		}
	}
	
	// 方法：访问内部类的属性
	public void getInnerProperty() {
		
		// 调用内部类的方法
		new InDemo2().getOutProperty();
		
		System.out.println("获取内部类中的变量：" + new InDemo2().inabc);
	}
	
	public static void main(String[] args) {
		
		Demo2 d = new Demo2();
		d.getInnerProperty();
	}
}
