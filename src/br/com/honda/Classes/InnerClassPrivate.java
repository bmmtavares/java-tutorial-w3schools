/*Exemplo
 * private na classe interna, 
 * gera erro de compilacao
 */
/*
package br.com.honda.Classes;

class OuterClass2 {
	int x = 10;

	private class InnerClass2 {
		int y = 5;
	}
}

public class InnerClassPrivate {

	public static void main(String[] args) {
		OuterClass2 myOuter = new OuterClass2();
		OuterClass2.InnerClass2 myInner = myOuter.new InnerClass2();
		System.out.println(myInner.y + myOuter.x);
	}

}
*/