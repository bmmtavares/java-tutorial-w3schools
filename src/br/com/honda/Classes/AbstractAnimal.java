package br.com.honda.Classes;

public abstract class AbstractAnimal {

	// abstract method (does not have a body)
	public abstract void animalSound();

	// regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

// subclass
class Porco extends AbstractAnimal {
	@Override
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}

	}
