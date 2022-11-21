package br.com.honda.JavaReference;

public class RefKeywordDefault {

	public static void main(String[] args) {
		
		int day = 4;	
		switch (day) {
		case 6:
			System.out.println("Today is saturday");
			break;
			
		case 7:
			System.out.println("Today is sunday");
			break;

		default:
			System.out.println("Looking forward to the weekend");
		}

	}

}
