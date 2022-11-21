package br.com.honda.Classes;

import java.util.HashMap;

public class HashMapDemoInteger {

	public static void main(String[] args) {

		// create a hashmap object called people
		HashMap<String, Integer> people = new HashMap<String, Integer>();

		// add keys and values (name, age)
		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);
		
		for(String i: people.keySet()){
			System.out.println("Name: "+i+" Age: "+people.get(i));
		}
	}

}
