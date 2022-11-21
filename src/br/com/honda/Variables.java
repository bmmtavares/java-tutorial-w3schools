package br.com.honda;

public class Variables {

	
	public static void main(String[] args) {
		
		
		String name = "John";
		System.out.println(name);
		
		int myNum = 15;
		myNum = 20; //sobrescreveu o valor anterior
		System.out.println(myNum);

		//para nao sobrescrever variavel
		final int Num = 100;
		//Num = 50; gera erro de compilacao
		System.out.println(Num);
		
		float myFloatNum = 5.99f;
		System.out.println(myFloatNum);
		
		char myLetter = 'D';
		System.out.println(myLetter);
		
		boolean myBool = true;
		System.out.println(myBool);
		
		//concatenacao com +
		System.out.println("Hello " + name);
		
		String firstName = "John ";
		String lastName = "Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		//operacao matematica de adicionar com +
		int x = 5;
		int y = 6;
		System.out.println(x + y); // Print the value of x + y
		
		//declaracao de multiplas variaveis
		int a = 5, b = 6, z = 50;
		System.out.println(a + b + z);
		
		//atribuir o mesmo valor a multiplas variaveis
		int q, w, e;
		q = w = e = 50;
		System.out.println(q + w + e);
		
		//nomes de variaveis (identificadores)
		int minutesPerHour = 60; //Good
		
		int m = 60; //OK, but not so easy to understand what m actually is
		
		System.out.println(minutesPerHour + " " + m);
		/*
		The general rules for naming variables are:

			Names can contain letters, digits, underscores, and dollar signs
			Names must begin with a letter
			Names should start with a lowercase letter and it cannot contain whitespace
			Names can also begin with $ and _ (but we will not use it in this tutorial)
			Names are case sensitive ("myVar" and "myvar" are different variables)
			Reserved words (like Java keywords, such as int or boolean) cannot be used as names
		 */
	}

}
