package com.kkb.innerClass;

// 抽象类
abstract class Product2 {
	
	private String proName;
	
	public abstract double getProPrice();
	
	// 构造器
	public Product2() {}
	public Product2(String proName) {
		this.proName = proName;
	}

	// get & set 方法
	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

}

public class Demo11 {
	
	public void abc(Product2 pro) {
		System.out.println("上次我去逛街，买了一个" + pro.getProName() 
		+ "，一共花了我" + pro.getProPrice() + "块钱。");
	}
	
	public static void main(String[] args) {
		
		Demo11 d = new Demo11();
		
		d.abc(new Product2("保温杯") {
			
			public double getProPrice() {
				return 30.0;
			}
		});
		
		// 调用无参数构造器去初始化 Product2 抽象类
		// 注意，不能直接调用无参数构造器来初始化，因为抽象类需要有实现
		Product2 p = new Product2() {
			
			// 实现抽象方法
			public double getProPrice() {
				return 18.0;
			}
			
			// 重写已有方法
			@Override
			public String getProName() {
				
				return "玩具";
			}
			
		};
		
		d.abc(p);
		
	}
	
}
