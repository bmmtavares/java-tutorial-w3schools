package br.com.honda.Classes;

public class ModifierStatic {

	//metodo static
	static void myStaticMethod(){
		System.out.println("Metodos estatico sao chamados sem criar objetos");
	}
	
	//metodo public
	public void myPublicMethod(){
		System.out.println("Metodos publicos devem ser chamados com a criacao de objetos");
	}
	
	//main
	public static void main(String[] args) {
		
		myStaticMethod(); //chamando estatico metodo
		
		ModifierStatic myObj = new ModifierStatic(); //criando objeto
		myObj.myPublicMethod(); //chamando publico metodo

	}

}
