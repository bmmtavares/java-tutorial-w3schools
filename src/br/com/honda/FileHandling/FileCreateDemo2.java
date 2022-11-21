package br.com.honda.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo2 {

	public static void main(String[] args) {

		try {
			File myObj = new File("D:\\Users\\sbp00408\\filename.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				System.out.println("Absolute path: " + myObj.getAbsolutePath());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error ocurred.");
			e.printStackTrace();
		}

	}

}
