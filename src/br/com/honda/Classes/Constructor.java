package br.com.honda.Classes;

public class Constructor {
	int x;
	
	// Create a class constructor
	public Constructor(){
		x = 5;
	}
	
	public static void main(String[] args) {
		
		Constructor myObj = new Constructor();
		System.out.println(myObj.x);

	}

}
