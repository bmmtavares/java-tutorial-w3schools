package br.com.honda.Classes;

import java.util.Scanner;

public class ApiScanner2 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter name, age and salary:");
		
		//String input
		String name = myObj.nextLine();
		
		//Numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		//Output inout by user
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);

		myObj.close();
	}

}
