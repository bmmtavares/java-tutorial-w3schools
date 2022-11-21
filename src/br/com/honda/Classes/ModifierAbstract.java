package br.com.honda.Classes;

abstract class Student {
	public String fname = "Bruno";
	public String lname = "Macedo";
	public String email = "bruno@honda.com";
	public int age = 35;

	public abstract void study(); // metodo abstrato
}

class ModifierAbstract extends Student{
	public int graduationYear=2018;
	
	public void study(){
		System.out.println("Studying all day long");
	}
	
	public static void main(String[] args){
		ModifierAbstract myObj = new ModifierAbstract();
		System.out.println("Nme: " + myObj.fname + " " + myObj.lname);
		System.out.println("E-mail: " + myObj.email);
		System.out.println("Age: " + myObj.age);
		System.out.println("Graduation year: "+myObj.graduationYear);
		myObj.study();
	}
}
