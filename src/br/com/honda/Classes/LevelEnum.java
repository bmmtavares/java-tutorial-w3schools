package br.com.honda.Classes;

public class LevelEnum {

	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}
	
	public static void main(String[] args) {
		
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);

	}

}
