package br.com.honda.JavaReference;

interface FirstInterface2 {
	public void myMethod(); // metodo da interface (nao tem corpo)
}

interface SecondInterface2 {
	public void myOtherMethod(); // metodo da interface (nao tem corpo)
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass2 implements FirstInterface2, SecondInterface2 {
	public void myMethod() {
		System.out.println("Some text...");
	}

	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

public class RefKeywordInterface2 {

	public static void main(String[] args) {

		DemoClass2 myObj = new DemoClass2();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
