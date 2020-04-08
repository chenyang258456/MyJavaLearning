package com.kkb.innerClass;

import com.kkb.innerClass.OutClass.InnerClass;

// 外部类
class OutClass {
	
	// 内部类
	// 如果不使用访问权限符的话，意味只有同一个包中其他类可以访问
	class InnerClass {
		// 构造器
		public InnerClass(String str) {
			System.out.println("内部类构造器：" + str);
		}
	}
}

// 子类继承内部类
class User extends OutClass.InnerClass {

	// 因为内部类没有无参数构造器了，继承之后，马上要实现一个有参数构造器
	/*public User(OutClass outClass, String str) {
		outClass.super(str);
	}*/
	
	public User(OutClass out) {
		out.super("180的班班");
	}

}


public class Demo7 {
	
	public static void main(String[] args) {
		
		// 获取内部类的实例
		// InnerClass in = new OutClass().new InnerClass("180的班班");
		OutClass.InnerClass in = new OutClass().new InnerClass("180的班班");
	}
	
}
