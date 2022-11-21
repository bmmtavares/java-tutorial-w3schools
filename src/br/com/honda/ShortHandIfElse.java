package br.com.honda;

public class ShortHandIfElse {

	public static void main(String[] args) {
		
		int time = 20;
		if (time < 18) {
			System.out.println("Good day.");
		}else {
			System.out.println("Good evening.");
		}
		
		//simplificando
		String result;
		result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);

	}

	//OK CONTINUAR EM: https://www.w3schools.com/java/java_switch.asp
}
