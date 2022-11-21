package br.com.honda.Classes;

class VehicleSuperClass { //se a classe tivesse a keyword final, nao poderia ser herdada
	protected String brand = "Ford";

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

public class HerancaCar extends VehicleSuperClass {

	private String modelName = "Mustang";

	public static void main(String[] args) {

		HerancaCar myFastCar = new HerancaCar();
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);

	}

}
