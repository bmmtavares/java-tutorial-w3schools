package br.com.honda.Classes;

public class DemoInterfaces implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("SOme text...");
	}

	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}
