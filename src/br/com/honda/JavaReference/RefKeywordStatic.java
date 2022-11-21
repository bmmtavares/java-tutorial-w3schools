package br.com.honda.JavaReference;

public class RefKeywordStatic {

	// static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	// public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	// main method
	public static void main(String[] args) {
		myStaticMethod(); // chamando metodo estatico

		RefKeywordStatic myObj = new RefKeywordStatic(); // criando objeto
		myObj.myPublicMethod(); // chamando metodo publico
	}

}

//OK-CONTINUAR EM: https://www.w3schools.com/java/ref_keyword_super.asp
