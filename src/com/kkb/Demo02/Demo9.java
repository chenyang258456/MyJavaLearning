package com.kkb.Demo02;

class Book{
	 String bookName = "西游记";
}

class JavaBook extends Book{
	protected String bookName = "Java编程思想";
}
public class Demo9 {
	public static void main(String[] args) {
		JavaBook java = new JavaBook();
		final String bookname1 = java.bookName;
		System.out.println(((Book)java).bookName);
		System.out.println(java.bookName);

		System.out.println(bookname1);
	}
}
