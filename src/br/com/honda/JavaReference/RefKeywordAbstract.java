package br.com.honda.JavaReference;

//abstract class
abstract class RefKeywordAbstract {

	public String fname = "John";
	public int age = 24;

	public abstract void study(); // abstract method

}

//subclass herdade de RefKeywordAbstract
class Student extends RefKeywordAbstract{
	public int graduationyear=2018;
	
	@Override
	public void study(){ //corpo do metodo abstrato, feito aqui
		System.out.println("Studying all day long");
	}
}
