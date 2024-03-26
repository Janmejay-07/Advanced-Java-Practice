package com.jsp.anonymousinnerclass;

public class AnimalDriver {

	public static void main(String[] args) {
		Animal human = new Animal() {
			public void talk() {
				System.out.println("Human is Talking");
			}
		};
		human.talk();

	}

}
