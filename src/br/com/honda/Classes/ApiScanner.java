package br.com.honda.Classes;

import java.util.Scanner;

public class ApiScanner {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		//Enter username and press Enter
		System.out.println("Enter username");
		userName = myObj.nextLine();
		
		System.out.println("User name is: "+userName);

		myObj.close();
	}

}
