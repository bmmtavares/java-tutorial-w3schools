package br.com.honda.JavaReference;

public class RefKeywordAbstractRun {

	public static void main(String[] args) {

		Student myObj = new Student(); // criar objeto de Student que herda
										// atributos e metodos de
										// RefKeywordAbstract

		System.out.println("Name:" + myObj.fname);
		System.out.println("Age:" + myObj.age);
		System.out.println("Graduation Year:" + myObj.graduationyear);
		myObj.study(); // chamar metodo abstrato

	}

}
