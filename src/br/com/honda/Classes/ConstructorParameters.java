package br.com.honda.Classes;

public class ConstructorParameters {

	int modelYear;
	String modelName;
	
	public ConstructorParameters(int year, String name){
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String[] args) {
		
		ConstructorParameters myCar = new ConstructorParameters(1969,"Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);

	}
	//OK-CONTINUAR https://www.w3schools.com/java/java_modifiers.asp
	
}
