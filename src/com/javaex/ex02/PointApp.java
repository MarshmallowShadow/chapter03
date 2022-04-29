package com.javaex.ex02;


public class PointApp {
	public static void main(String[] args) {
		Point p01 = new Point(3,5);
		Point p02 = new Point(3,5);
		Point p03 = new Point(4, 10);
		Point p04 = p01;
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println(p01.getX());
		System.out.println(p01.getClass());
		System.out.println(p01.equals(p02));
		System.out.println(p01.toString());
		System.out.println(p01.hashCode());
		
		System.out.println("=========================");
		
		System.out.println(p01.equals(p02));
		System.out.println(p01.equals(p03));
		System.out.println(p01.equals(p04));
		System.out.println(p01 == p04);
		
		System.out.println("=========================");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
	}
}
