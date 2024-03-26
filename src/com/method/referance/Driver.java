package com.method.referance;

public class Driver {
	public static void main(String[] args) {
		A a = i -> {
			System.out.println(i);
			return 2;
		};
		System.out.println(a.m1(26));
	}

}
