package br.com.honda.Classes;

import java.util.ArrayList;

public class ArrayListaDemoRemove {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.remove(0);
		System.out.println(cars);

	}

}
