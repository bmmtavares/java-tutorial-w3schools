package br.com.honda.HowTo;

import java.util.Scanner;

public class HowToAdd2NumbersScanner {

	public static void main(String[] args) {

		int x, y, sum;

		Scanner myObj = new Scanner(System.in); // create scanner object
		System.out.println("Type a number:");
		x = myObj.nextInt(); // read user input

		System.out.println("Type another number:");
		y = myObj.nextInt(); // read user input

		sum = x + y;
		System.out.println("Sum is: " + sum);

		myObj.close();
	}

}
