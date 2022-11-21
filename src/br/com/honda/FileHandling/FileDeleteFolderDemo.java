package br.com.honda.FileHandling;

import java.io.File;

public class FileDeleteFolderDemo {

	public static void main(String[] args) {

		File myObj = new File("D:\\Java\\eclipse\\workspace\\JavaTutorialW3Schools\\Test");
		if (myObj.delete()) {
			System.out.println("Delete the folder: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the folder.");
		}

	}

}
//OK-CONTINUAR EM: https://www.w3schools.com/java/java_howto_add_two_numbers.asp