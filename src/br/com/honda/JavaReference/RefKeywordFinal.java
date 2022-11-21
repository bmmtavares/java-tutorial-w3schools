package br.com.honda.JavaReference;

public class RefKeywordFinal {

	final int x = 10;

	public static void main(String[] args) {

		RefKeywordFinal myObj = new RefKeywordFinal();
		//myObj.x = 25; nao pode ser modificado
		System.out.println(myObj.x);

	}

}

//OK-CONTINUAR EM: https://www.w3schools.com/java/ref_keyword_finally.asp