package com.javaex.ex06;

public class Ex03 {
	public static void main(String[] args) {
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);
		Short s01 = new Short((short)3);
		Byte b01 = new Byte((byte)3);
		
		Integer iResult = new Integer(3) + new Integer(5);
		System.out.println(iResult);
		
		Integer no = 3;
		
		int r01 = Integer.parseInt("1234");
		System.out.println(r01 + 1);
		
		String str = "안녕하세요";
		String str01 = String.valueOf(555);
		System.out.println(str01 + 1);
	}
}
