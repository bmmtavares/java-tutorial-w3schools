package br.com.honda.Classes;

import java.util.LinkedList;

public class LinkedListDemoGetLast {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Use getLast() to display the last item in the list
		System.out.println(cars.getLast());

	}

}

//OK-CONTINUAR EM: https://www.w3schools.com/java/java_hashmap.asp
