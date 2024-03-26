package com.jsp.methodlocalinnerclass;

public class A {
	public void m1() {
		class B {
			int a = 20;

			public void m1() {
				System.out.println("Hello Jay");
			}
		}
		B b = new B();
		b.m1();
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}

}
