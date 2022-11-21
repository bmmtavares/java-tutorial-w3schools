package br.com.honda.Classes;

public class Second {

	public static void main(String[] args) {
		
		Main myObj = new Main();
		//myObj.x = 40; //gera erro de compilacao, pois x foi declarado como final
		
		Main myObj2 = new Main();		
		myObj2.y = 25;
		
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		System.out.println(myObj2.y);
		
		Main pessoa = new Main();
		System.out.println("Name: "+pessoa.fname+" "+pessoa.lname);
		System.out.println("Age: "+pessoa.age);

		//OK-CONTINUAR EM:https://www.w3schools.com/java/java_class_methods.asp
	}

}
