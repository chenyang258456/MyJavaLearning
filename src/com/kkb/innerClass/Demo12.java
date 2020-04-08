package com.kkb.innerClass;

// 接口
interface Hello {
	void abc();
}

public class Demo12 {

	public static void main(String[] args) {

		int a = 18;

		Hello h = new Hello() {

			public void abc() {
				// 在封闭范围内定义的局部变量 a 必须是 final 或有效的 final
				// 匿名内部类中、局部内部类都允许去访问外面非 final 修饰的变量
				System.out.println(a);
			}
		};

		h.abc();

	}

}
