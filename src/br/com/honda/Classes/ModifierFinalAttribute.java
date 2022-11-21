package br.com.honda.Classes;

public class ModifierFinalAttribute {

	final int x = 10;
	final double PI = 3.14;

	public static void main(String[] args) {
		ModifierFinalAttribute myObj = new ModifierFinalAttribute();
		//myObj.x = 50; //gera erro
		//myObj.PI = 25; //gera erro
		System.out.println(myObj.x);

	}

}
