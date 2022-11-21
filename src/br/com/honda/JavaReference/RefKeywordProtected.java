package br.com.honda.JavaReference;

class Person {
	protected String fname = "John";
	protected String lname = "Doe";
	protected String email = "john@doe.com";
	protected int age = 24;
}

public class RefKeywordProtected extends Person {
	private int graduationYear = 2018;

	public static void main(String[] args) {

		RefKeywordProtected myObj = new RefKeywordProtected();
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Email: " + myObj.email);
		System.out.println("Age: " + myObj.age);
		System.out.println("Graduation Year: " + myObj.graduationYear);

	}

}
