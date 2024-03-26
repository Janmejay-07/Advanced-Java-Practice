package com.jsp.lamdaexpression;

public class Driver {
	public static void main(String[] args) {
		A a = i -> {
			System.out.println(i);
			return 3;
		};
		System.out.println(a.m1(56));
	}

}
