package br.com.honda.Classes;

class OuterClass4 {
	int x = 10;

	class InnerClass4 {
		public int myInnerMethod() {
			return x;
		}
	}
}

public class InnerClassAccessOuterClass {

	public static void main(String[] args) {
		OuterClass4 myOuter = new OuterClass4();
		OuterClass4.InnerClass4 myInner = myOuter.new InnerClass4();
		System.out.println(myInner.myInnerMethod());
	}

}
//OK-CONTINUAR EM: https://www.w3schools.com/java/java_abstract.asp