package br.com.honda.JavaReference;

interface FirstInterface {
	public void myMethod(); // metodo abstrato da interface
}

interface SecondInterface {
	public void myOtherInterface(); // metodo abstrato da interface
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
	@Override
	public void myMethod() {
		System.out.println("Some text...");
	}

	@Override
	public void myOtherInterface() {
		System.out.println("Some other text...");
	}
}

public class RefKeywordImplements2 {

	public static void main(String[] args) {

		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherInterface();

	}

}

//OK-CONTINUAR EM:https://www.w3schools.com/java/ref_keyword_import.asp
