package br.com.honda;

public class Strings {

	public static void main(String[] args) {
	
		//Armazenar textos
		String greeting = "Hello";
		System.out.println(greeting);

		//Metodos disponiveis para a classe String
			//length
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: "+txt.length());
		
		
		//More String methods
			//toUpperCase
			//toLowerCase
		String texto = "Hello World";
		System.out.println(texto.toUpperCase());
		System.out.println(texto.toLowerCase());
		
		//Finding a character in a string
			//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
		
		String acharTexto = "Please locate where 'locate' occurs!";
		System.out.println(acharTexto.indexOf("locate"));
		/*
		Java counts positions from zero.
		0 is the first position in a string, 1 is the second, 2 is the third ...
		*/
		
		//Concatenation - combinacao de strings
		String firstName="John";
		String lastName="Doe";
		System.out.println(firstName + " " + lastName);
		firstName="John ";
		System.out.println(firstName.concat(lastName));
		
		/*
		 * WARNING!

			Java uses the + operator for both addition and concatenation.
			
			Numbers are added. Strings are concatenated.
		 */
		
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);
		
		String x1 = "10";
		String y1 = "20";
		String z1 = x1 + y1;
		System.out.println(z1);
		
		String x2 = "10";
		int y2 = 20;
		String z3 = x2 + y2;
		System.out.println(z3);
		
		//Special Characters - escape de caracteres especiais usar a barra-invertida
		
		//escapar aspas
		String txt2 = "We are the so-called \"Vinkings\" from the north.";
		System.out.println(txt2);
		
		//escapar aspas simples
		String txt3 = "It\'s alright.";
		System.out.println(txt3);
		
		//inserir barra simples
		String txt4 = "The character \\ is called backlash.";
		System.out.println(txt4);
		
		//nova linha
		String txt5 = "Nova\nLinha!";
		System.out.println(txt5);
		
		//retorno de carro
		String txt6 = "Retorno de Carro\rProx"; //ele voltou pro inicio da linha e substituiu o "Reto" por "Prox"
		System.out.println(txt6);
		
		//tab
		String txt7 = "OlaTab\tMundo!";
		System.out.println(txt7);
		
		//backspace
		String txt8 = "Ol\baMundo com backspace";
		System.out.println(txt8);
	}

}
