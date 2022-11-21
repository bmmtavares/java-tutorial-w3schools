package br.com.honda.Classes;

import java.util.ArrayList;

public class ArrayListaDemoClear {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.clear();
		System.out.println(cars);

	}

}
