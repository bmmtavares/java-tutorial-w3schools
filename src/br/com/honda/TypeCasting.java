package br.com.honda;

public class TypeCasting {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * In Java, there are two types of casting:

			Widening Casting (automatically) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double
			
			Narrowing Casting (manually) - converting a larger type to a smaller size type
			double -> float -> long -> int -> char -> short -> byte
		 */
		
		int myInt = 9;
		double myDouble = myInt; //automatic casting: int to double
		
		System.out.println(myInt);
		System.out.println(myDouble);

		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2; //manual casting: double to int
		
		System.out.println(myDouble2);
		System.out.println(myInt2);
	}

}
