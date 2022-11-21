package br.com.honda.Classes;

enum LevelSwitch {
	LOW, MEDIUM, HIGH
}

public class EnumSwitch {

	public static void main(String[] args) {

		LevelSwitch myVar = LevelSwitch.MEDIUM;

		switch (myVar) {
		case LOW:
			System.out.println("low level");
			break;

		case MEDIUM:
			System.out.println("medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;

		}

	}

}
