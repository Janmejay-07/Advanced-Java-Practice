package com.jsp.staticinnerclass;

public class A {
	static class B{
		public static void m1() {
			System.out.println("m1 static method invoked");
		}
		public void m2() {
			System.out.println("m2 method is invoked");
		}
	}

}
