package br.com.honda.Classes;

import java.util.ArrayList;

public class ArrayListaDemoLoop {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for(int i =0; i<cars.size();i++){
			System.out.println(cars.get(i));
		}

	}

}
