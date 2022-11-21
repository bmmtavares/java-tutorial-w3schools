package br.com.honda.JavaReference;

public class RefKeywordThrows {

	static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enought!");
		}
	}

	public static void main(String[] args) {

		checkAge(15);

	}

}
//OK-CONTINUAR EM:https://www.w3schools.com/java/ref_keyword_try.asp
