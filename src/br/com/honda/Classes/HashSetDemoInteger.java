package br.com.honda.Classes;

import java.util.HashSet;

public class HashSetDemoInteger {

	public static void main(String[] args) {

		// create a hashset object called numbers
		HashSet<Integer> numbers = new HashSet<Integer>();

		// add value to the set
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);

		// show which numbers between 1 and 10 are in the set
		for (int i = 1; i <= 10; i++) {
			if (numbers.contains(i)) {
				System.out.println(i + " was found in the set");
			} else {
				System.out.println(i + " was not found in the set");
			}
		}
	}

}
//OK-CONTINUAR EM: https://www.w3schools.com/java/java_iterator.asp
