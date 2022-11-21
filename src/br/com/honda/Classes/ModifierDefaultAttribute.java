package br.com.honda.Classes;

public class ModifierDefaultAttribute {

	String fname="John";
	String lname="Doe";
	String email="john@doe.com";
	int age=24;
	
	public static void main(String[] args) {

		ModifierDefaultAttribute myObj = new ModifierDefaultAttribute();
		System.out.println("Nme: " + myObj.fname + " " + myObj.lname);
		System.out.println("E-mail: " + myObj.email);
		System.out.println("Age: " + myObj.age);

	}

}
