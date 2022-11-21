package br.com.honda.JavaReference;

interface Animal {
	public void animalSound(); // metodo da interface (nao tem corpo)

	public void sleep(); // metodo da interface (nao tem corpo)
}

class Pig implements Animal {

	@Override
	public void animalSound() {

		System.out.println("Tha pig says: wee wee");

	}

	@Override
	public void sleep() {
		System.out.println("Zzz");

	}
}

public class RefKeywordImplements {

	public static void main(String[] args) {

		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();

	}

}
