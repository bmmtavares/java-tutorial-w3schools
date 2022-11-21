package br.com.honda.Classes;

class Person {
	protected String fname = "Bruno";
	protected String lname = "Macedo";
	protected String email = "bruno@honda.com.br";
	protected int age = 35;
}

public class ModifierProtectedAttribute extends Person {
	private int graduationYear = 2009;

	public static void main(String[] args) {

		ModifierProtectedAttribute myObj = new ModifierProtectedAttribute();
		System.out.println("Nme: " + myObj.fname + " " + myObj.lname);
		System.out.println("E-mail: " + myObj.email);
		System.out.println("Age: " + myObj.age);
		System.out.println("Graduation year: " + myObj.graduationYear);

	}

}
