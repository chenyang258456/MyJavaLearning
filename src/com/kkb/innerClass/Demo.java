package com.kkb.innerClass;


/*
	类：用来表示某一种类型的数据，比如人类、猪类、糖果类、牛奶类、、、
	
	商城 -- 商城类 Shop      订单 -- 订单类 Order
	
	类，最终的作用，就是模拟出来处理业务逻辑或者是用来封装数据。
	
	JavaBean：用来封装从数据库中获取到的数据，比如 User 用户
	
	tb_user（数据/记录）  ---> 封装数据 ---> User 类
	
	有一些数据，需要封装，然后就是一次性的，而且不想让外边的人知道，就只能自己吃。
	
	反射技术中，也是比较常用的。
*/

// 外部类
public class Demo {
	
	private String abc = "外部类的变量";

	// 内部类
	private class InDemo {
		
		private String abc = "内部类的变量";
		
		public void getMsg() {
			
			// 局部变量
			String str = "内部类的局部变量";
			
			// 访问外部类的变量
			System.out.println("获取外部类的变量：" + Demo.this.abc);
			
			// 访问内部类的变量
			// System.out.println("获取内部类的变量：" + this.abc);
			System.out.println("获取内部类的变量：" + abc);
			
			// 访问局部变量
			System.out.println("获取内部类的局部变量：" + str);
		}
	}
	
	// 方法
	public void test() {
		
		InDemo id = new InDemo();
		id.getMsg();
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.test();
		
	}

}
