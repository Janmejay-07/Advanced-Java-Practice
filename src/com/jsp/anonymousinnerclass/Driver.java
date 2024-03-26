package com.jsp.anonymousinnerclass;

public class Driver {

	public static void main(String[] args) {
		Car c = new Car() {
			public void start() {
				System.out.println("Car has been started,peep-peep");
			}
		};
		Car c1 = new Car() {
			public void start() {
				System.out.println("Car started");
			}
		};
		c.start();
		c1.start();

	}

}
