package br.com.honda;

public class Operators {

	public static void main(String[] args) {
		
		int x = 100 + 50;
		System.out.println(x);

		int sum1 = 100 + 50;
		int sum2 = sum1 + 250;
		int sum3 = sum2 + sum2;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		//Arithmetic Operators
			//addition
			int w = 5;
			int y = 3;
			System.out.println(w + y);
			
			//subtraction
			System.out.println(w - y);
			
			//multiplication
			System.out.println(w * y);
			
			//division
			w = 12;
			System.out.println(w / y);
			
			//modulus = resto divisao
			System.out.println(5 % 2);
			
			//increment
			int count = 5;
			++count;
			System.out.println(count);
			
			//decrement
			count = 5;
			--count;
			System.out.println(count);
			
		//Assignment Operators
			int index = 10;
			System.out.println(index);
			
			index += 5;
			System.out.println(index);
			
			index -= 3;
			System.out.println(index);
			
			index *= 3;
			System.out.println(index);
			
			double n1 = 5;
			n1 /= 3;
			System.out.println(n1);
			
			n1 = 5;
			n1 %= 3;
			System.out.println(n1);
			
			int n2 = 5;
			n2 &= 3;
			System.out.println(n2);
			
			n2 = 5;
			n2 |= 3;
			System.out.println(n2);
			
			n2 = 5;
			n2 ^= 3;
			System.out.println(n2);
			
			n2 = 5;
			n2 >>= 3;
			System.out.println(n2);
			
			n2 = 5;
			n2 <<= 3;
			System.out.println(n2);
			
		//Comparison Operators
			int nro1 = 5;
			int nro2 = 3;
			System.out.println(nro1 == nro2); //returns false because 5 is not equal to 3
			
			System.out.println(nro1 != nro2); //returns true because 5 is not equal to 3
			
			System.out.println(nro1 > nro2); //returns true because 5 is greater than 3
			
			System.out.println(nro1 < nro2); //returns false because 5 is not less than 3
			
			System.out.println(nro1 >= nro2); //returns true because 5 is greater, or equal, to 3
			
			System.out.println(nro1 <= nro2); //returns false because 5 is neither less or equal to 3
			
		//Logical Operators
			System.out.println( nro1 > 3 && nro1 < 10); //returns true because 5 is greater than 3 AND 5 is less than 10
			
			System.out.println( nro1 > 3 || nro1 < 4); //returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
			
			System.out.println(!(nro1 > 3 && nro1 < 10)); //returns false because ! (not) is used to reverse the result
			
	//PAREI EM:https://www.w3schools.com/java/java_strings.asp
			//OK-CONTINUAR!
	}

}
