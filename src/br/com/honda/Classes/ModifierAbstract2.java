package br.com.honda.Classes;

abstract class Estudante {
	public String fname = "Bruno";
	public int age = 35;

	public abstract void study(); // metodo abstrato
}

//subclasse heranca
public class ModifierAbstract2 extends Estudante {
	public int graduationYear = 2009;

	@Override
	public void study() { //corpo do metodo abstrato e feito aqui
		
		System.out.println("Studying all day long");
		
	}

}
