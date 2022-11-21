package br.com.honda;

public class ArraysLoop {

	public static void main(String[] args) {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("for each");
		for (String i : cars) {
			System.out.println(i);
		}

	}

}
