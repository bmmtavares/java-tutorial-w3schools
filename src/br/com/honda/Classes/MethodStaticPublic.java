package br.com.honda.Classes;

public class MethodStaticPublic {

	//static method
	static void myStaticMethod(){
		System.out.println("Static methods can be called without creating objects");
	}
	
	//public method
	public void myPublicMethod(){
		System.out.println("Public methods must be called by creating objects");
	}
	
	//main method
	public static void main(String[] args) {
		
		myStaticMethod();
		
		MethodStaticPublic myObj = new MethodStaticPublic(); // Create an object of MethodStaticPublic
		myObj.myPublicMethod(); // Call the public method

	}

}
