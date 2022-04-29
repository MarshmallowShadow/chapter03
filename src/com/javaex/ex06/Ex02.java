package com.javaex.ex06;

public class Ex02 {
	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(" , efgh  ");
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println("__"+a+"__");
		
		a = a.replace("ab", "12");
		System.out.println(a);
		
		System.out.println("--------------------");
		
		String[] sArray = a.split(",");
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		System.out.println(a);
		
		System.out.println("--------------------");
		
		String str = "hello python!";
		String subStr = str.substring(6);
		System.out.println(subStr);
		
		String subStr2 = str.substring(9,12);
		System.out.println(subStr2);
	}
}
