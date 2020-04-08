package com.kkb.innerClass;


// 接口
interface Product {
	
	// 获取商品价格
	double getProductPrice();
	
	// 获取商品名字
	String getProductName();
}

public class Demo10 {
	
	// 方法
	public void abc(Product pro) {
		System.out.println("上次我去逛街，买了一个" + pro.getProductName() 
		+ "，一共花了我" + pro.getProductPrice() + "块钱。");
	}
	
	public static void main(String[] args) {
		
		Demo10 d = new Demo10();
		
		d.abc(new Product() {
			
			// 获取商品价格
			public double getProductPrice() {
				return 18.8;
			}
			
			// 获取商品名字
			public String getProductName() {
				return "纯尼龙的毛巾";
			}
		});
	}
	
}
