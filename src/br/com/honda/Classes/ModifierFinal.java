package br.com.honda.Classes;

final class Vehicle {
	protected String brand = "Ford";

	public void honk() {
		System.out.println("Tuut, tuut");
	}
}
/*
public class ModifierFinal extends Vehicle {
	private String modelName = "Mustang";

	public static void main(String[] args) {

		ModifierFinal myFastCar = new ModifierFinal();
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);

	}

}
*/