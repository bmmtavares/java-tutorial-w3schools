package br.com.honda;

public class IfElse {

	public static void main(String[] args) {
		
		if(20 > 18) {
			System.out.println("20 is greater than 18"); //obviousy
		}
		
		int x = 20;
		int y = 18;
		if (x > y) {
			System.out.println("x is greater than y");
		}
		
		int time = 20;
		if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		
		time = 22;
		if (time < 10) {
			System.out.println("Good morning.");
		}else if(time < 20){
			System.out.println("Good day.");
		}else{
			System.out.println("Googd evening");
		}

	}

}
