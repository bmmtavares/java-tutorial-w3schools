package br.com.honda.Classes;

//import.java.util.*; //importa todas as classe do pacote java.util
import java.util.Scanner; //importa a classe especifica

public class PackagesApiScanner {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		String userName;

		// Enter username and press Enter
		System.out.println("Enter username");
		userName = myObj.nextLine();

		System.out.println("Username is: " + userName);

		myObj.close();
	}

}
