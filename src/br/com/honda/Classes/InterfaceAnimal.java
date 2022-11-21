package br.com.honda.Classes;

public interface InterfaceAnimal {
	public void animalSound(); //interface method (does not have a body)
	public void sleep(); //interface method (does not have a body)
}

class Pig2 implements InterfaceAnimal{
	public void animalSound(){
		System.out.println("The pig says wee wee");
	}
	public void sleep(){
		System.out.println("Zzz");
	}
}

