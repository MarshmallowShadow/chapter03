package com.javaex.ex01;

public class Ex01 {
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode()); //진짜 주소 대체 (abstraction)
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));
		
		System.out.println("================================");
		
		System.out.println("obj.getClass()==================");
		System.out.println(obj.getClass());
		System.out.println(obj2.getClass());
		System.out.println(obj3.getClass());
		
		System.out.println("obj.hashCode()===================");
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println("obj.toString()===================");
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		System.out.println("obj.equals(Object obj)===========");
		System.out.println(obj.equals(obj));
		System.out.println(obj2.equals(obj3));
	}
}
