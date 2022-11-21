package br.com.honda.Classes;

public class ModifierPrivateAttribute {

	private String fname="John";
	private String lname="Doe";
	private String email="john@doe.com";
	private int age=24;
	
	public static void main(String[] args) {

		ModifierPrivateAttribute myObj = new ModifierPrivateAttribute();
		System.out.println("Nme: " + myObj.fname + " " + myObj.lname);
		System.out.println("E-mail: " + myObj.email);
		System.out.println("Age: " + myObj.age);

	}

}
