package br.com.honda.Classes;

enum LevelLoop {
	LOW, MEDIUM, HIGH
}

public class LoopEnum {

	public static void main(String[] args) {

		for (LevelLoop myVar : LevelLoop.values()) {
			System.out.println(myVar);
		}

	}

}
//OK-CONTINUAR EM: https://www.w3schools.com/java/java_user_input.asp