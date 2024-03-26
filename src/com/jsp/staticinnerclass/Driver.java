package com.jsp.staticinnerclass;

public class Driver {
	public static void main(String[] args) {
		A.B b = new A.B();
		A.B.m1();
		b.m2();
	}

}
