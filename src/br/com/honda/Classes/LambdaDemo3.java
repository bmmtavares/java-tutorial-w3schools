package br.com.honda.Classes;

interface StringFunction {
	String run(String str);
}

public class LambdaDemo3 {

	public static void main(String[] args) {

		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);

	}

	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}

}

//OK-CONTINUAR EM:https://www.w3schools.com/java/java_files.asp
//OK-CONTINUAR EM:https://www.w3schools.com/java/java_files_create.asp
