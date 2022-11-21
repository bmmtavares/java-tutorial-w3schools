package br.com.honda.Classes;

class OuterClass3 {
	int x = 10;

	static class InnerClassStatic {
		int y = 5;
	}
}

public class InnerClassStatic {

	public static void main(String[] args) {
		OuterClass3.InnerClassStatic myInner = new OuterClass3.InnerClassStatic();
		System.out.println(myInner.y);
	}

}
