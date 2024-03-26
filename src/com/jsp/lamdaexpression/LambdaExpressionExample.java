package com.jsp.lamdaexpression;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		int width = 10;

//without Lambda expression 

		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawable " + width);
			}
		};
		d.draw();

	}

}
