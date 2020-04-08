package com.kkb.enumDemo;

public enum User2 {

	boy, girl;

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {

		switch (this) {
			case boy:
				if (userName.equals("帅帅")) {
					this.userName = userName;
				} else {
					System.out.println("你是不是搞错了");
					return;
				}
				break;
			case girl:
				if (userName.equals("郭漂亮")) {
					this.userName = userName;
				} else {
					System.out.println("你是不是搞错了");
					return;
				}
				break;
		}

	}

}
