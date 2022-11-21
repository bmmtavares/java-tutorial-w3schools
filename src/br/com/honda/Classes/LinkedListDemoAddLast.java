package br.com.honda.Classes;

import java.util.LinkedList;

public class LinkedListDemoAddLast {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		
		//Use addLast() to add the item to the end
		cars.addLast("Mazda");
		System.out.println(cars);

	}

}
