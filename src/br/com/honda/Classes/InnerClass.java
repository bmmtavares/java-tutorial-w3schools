package br.com.honda.Classes;

class OuterClass {
	int x = 10;

	class InnerClass1 {
		int y = 5;
	}
}

public class InnerClass {

	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass1 myInner = myOuter.new InnerClass1();
		System.out.println(myInner.y + myOuter.x);
	}

}
