package br.com.honda.Classes;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListaDemoSortIntegers {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		Collections.sort(cars);
		
		for(String i: cars){
			System.out.println(i);
		}
		
	}

}
