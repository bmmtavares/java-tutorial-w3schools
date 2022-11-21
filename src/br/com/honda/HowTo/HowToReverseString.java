package br.com.honda.HowTo;

public class HowToReverseString {

	public static void main(String[] args) {

		String originalStr = "Hello";
		String reversedStr = "";
		System.out.println("Original string: " + originalStr);

		for (int i = 0; i < originalStr.length(); i++) {
			//System.out.println(i);
			//System.out.println(originalStr.charAt(i));
			System.out.println("antes-"+reversedStr);
			reversedStr = originalStr.charAt(i) + reversedStr;
			System.out.println("depois-"+reversedStr);
		}

		System.out.println("Reversed string: " + reversedStr);
	}

}

//OK-CONTINUAR EM:https://www.w3schools.com/java/java_ref_keywords.asp
