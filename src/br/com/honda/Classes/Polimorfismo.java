package br.com.honda.Classes;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

public class Polimorfismo {

	public static void main(String[] args) {

		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();

		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		
	}

}

//OK-continuar em: https://www.w3schools.com/java/java_inner_classes.asp
