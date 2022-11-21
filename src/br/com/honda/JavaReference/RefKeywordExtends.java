package br.com.honda.JavaReference;

class Veiculo {
	protected String brand = "Ford";

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

public class RefKeywordExtends extends Veiculo {
	private String modelName = "Mustang";

	public static void main(String[] args) {

		RefKeywordExtends myFastCar = new RefKeywordExtends();
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);

	}

}
