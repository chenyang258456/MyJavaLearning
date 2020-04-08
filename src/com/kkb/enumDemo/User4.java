package com.kkb.enumDemo;

// 让枚举类来实现接口
public enum User4 implements UserIface {
	
	// 这样写报错，因为没有有参数构造器
	boy("帅帅"){
		public void abc() {
			System.out.println("男孩");
		}
	},
	
	girl("班班"){
		public void abc() {
			System.out.println("女孩");
		}
	};
	
	private final String userName;
	
	// 构造器
	private User4(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	
	;
	@Override
	public void abc() {
		System.out.println("实现的 abc() 方法");
	}

}
