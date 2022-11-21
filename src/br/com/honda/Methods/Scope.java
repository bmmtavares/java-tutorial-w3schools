package br.com.honda.Methods;

public class Scope {

	public static void main(String[] args) {

		// Code here cannot use x

		int x = 100;

		// Code here can use x
		System.out.println(x);

		// Code here cannot use y
		{ // this is a block
			// code here cannot use y
			int y = 1000;

			// Code here can use y
			System.out.println(y);

		} // the block ends here
			// Code here cannot use y
	}

}
