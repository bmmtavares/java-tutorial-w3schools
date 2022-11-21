package br.com.honda.FileHandling;

import java.io.FileWriter; //import the FileWriter class
import java.io.IOException; //import the IOExecption class to handle errors

public class FileWriteDemo {

	public static void main(String[] args) {
		
		try{
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enought!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		}catch(IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
