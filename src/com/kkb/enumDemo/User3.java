package com.kkb.enumDemo;

public enum User3 {

	boy("帅帅"), girl("班班");
	
	private final String userName;

	// 有参数构造器
	private User3(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	
	
}
