package br.com.honda.Classes;

public class TestModifiedAbstract2 {

	public static void main(String[] args) {
		
		ModifierAbstract2 myObj = new ModifierAbstract2();	//cria objeto da classe ModifierAbstract2 que herda da classe Estudante
		
		System.out.println("Name: "+myObj.fname);
		System.out.println("Age: "+myObj.age);
		System.out.println("Graduation Year: "+myObj.graduationYear);
		
		myObj.study(); //chamando abstrato metodo	

	}

}

//OK-CONTINUAR EM: https://www.w3schools.com/java/java_encapsulation.asp