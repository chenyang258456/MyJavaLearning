package com.kkb.classdemo;

public class ManyArgs {
	public static void manyargs(String Nmme,String Class,String... array) {
		for (String arr:array) {
			System.out.println(arr); ;
		}
	
		
	}
	public static void main(String[] args) {
		ManyArgs.manyargs("湖泊", "琥珀", "hello","ninja");
	}
}
