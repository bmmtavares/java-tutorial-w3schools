package br.com.honda.JavaReference;

public class RefKeywordThis {

	int x;

	public RefKeywordThis(int x) {
		this.x = x;
	}

	public static void main(String[] args) {

		RefKeywordThis myObj = new RefKeywordThis(5);
		System.out.println("Value of x= " + myObj.x);

	}

}
