package br.com.honda.JavaReference;

class AnimalGenerico { // superclasse (pai)
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}

}

class Dog extends AnimalGenerico { // subclasse (filha)
	@Override
	public void animalSound() {
		super.animalSound(); // chama o metodo da superclasse
		System.out.println("The dog says: bow wow");
	}
}

public class RefKeywordSuper {

	public static void main(String[] args) {
		AnimalGenerico myDog = new Dog(); // criar objeto Dog
		myDog.animalSound(); // chamar metodo no objeto Dog
	}

}

//OK-CONTINUAR EM: https://www.w3schools.com/java/ref_keyword_switch.asp