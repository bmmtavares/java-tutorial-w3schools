package br.com.honda;

public class Arrays {

	public static void main(String[] args) {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars[0]);

		cars[0] = "Ope1";
		System.out.println(cars[0]);

		System.out.println(cars.length);
	}

}
