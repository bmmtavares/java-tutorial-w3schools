package br.com.honda.JavaReference;

public class RefKeywordCatch {

	public static void main(String[] args) {

		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

	}

}
//OK-CONTINUAR EM:https://www.w3schools.com/java/ref_keyword_char.asp