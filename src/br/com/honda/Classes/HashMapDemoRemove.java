package br.com.honda.Classes;

import java.util.HashMap;

public class HashMapDemoRemove {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String,String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.remove("England");
		System.out.println(capitalCities);

	}

}