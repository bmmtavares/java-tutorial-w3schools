package br.com.honda.JavaReference;

interface Animal2 {
	public void animalSound(); // metodo da interface (nao tem corpo)

	public void sleep(); // metodo da interface (nao tem corpo)
}

class Pig2 implements Animal2 {

	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		System.out.println("Zzz");
	}
}

public class RefKeywordInterface {

	public static void main(String[] args) {

		Pig2 myPig = new Pig2();
		myPig.animalSound();
		myPig.sleep();

	}

}
