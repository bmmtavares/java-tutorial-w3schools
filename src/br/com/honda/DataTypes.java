/**
 * 
 */
package br.com.honda;

/**
 * @author SBP00408
 *
 */
public class DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int myNum = 5; // inteiros
		float myFloatNum = 5.99f; // ponto flutuantes, nro com casa decimal
		char myLetter = 'D'; // caractere
		boolean myBool = true; // booleano
		String myText = "Hello"; // string/cadeia de texto

		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);

		/*
		 * Data types are divided into two groups: Primitive data types -
		 * includes byte, short, int, long, float, double, boolean and char
		 * Non-primitive data types - such as String, Arrays and Classes (you
		 * will learn more about these in a later chapter)
		 */

		// Tipos de inteiro

		// Byte - The byte data type can store whole numbers from -128 to 127.
		byte myByte = 100;
		System.out.println(myByte);

		// Short - The short data type can store whole numbers from -32768 to
		// 32767:
		short myShort = 5000;
		System.out.println(myShort);

		// Int - The int data type can store whole numbers from -2147483648 to
		// 2147483647.
		int myInt = 100000;
		System.out.println(myInt);

		// Long - The long data type can store whole numbers from
		// -9223372036854775808 to 9223372036854775807
		long myLong = 15000000000L;
		System.out.println(myLong);

		// Tipos de inteiro com decimais

		// Float - The precision of float is only six or seven decimal digits
		float myFloat = 5.75f;
		System.out.println(myFloat);

		// Double - have a precision of about 15 digits
		double myDouble = 19.99d;
		System.out.println(myDouble);

		// Numeros Cientificos - Potencia de 10 - usar "e"
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);

		// Booleanos - apenas true ou false
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun); // Saida true
		System.out.println(isFishTasty); // Saida false

		// Caractere - The char data type is used to store a single character.
		char myGrade = 'B';
		System.out.println(myGrade);
		// usando tabela ASCII
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);

		// Strings - cadeias de texto
		String greeting = "Hello World";
		System.out.println(greeting);

	}

}
