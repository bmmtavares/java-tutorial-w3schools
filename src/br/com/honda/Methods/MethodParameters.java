package br.com.honda.Methods;

public class MethodParameters {

	static void myMethod(String fname) {
		System.out.println(fname + " Refsnes");
	}

	static void myMethod2(String fname, int age) {
		System.out.println(fname + " is " + age);
	}

	static int myMethod3(int x) {
		return 5 + x;
	}

	static int myMethod4(int x, int y) {
		return x + y;
	}

	static int myMethod5(int x, int y) {
		return x + y;
	}

	// Create a checkAge() method with an integer parameter called age
	static void checkAge(int age) {

		// If age is less than 18, print "access denied"
		if (age < 18) {
			System.out.println("Access denied - You are not enough!");

			// If age is greater than, or equal to, 18, print "access granted"
		} else {
			System.out.println("Access granted - You are old enough");
		}
	}

	public static void main(String[] args) {
		myMethod("Bruno");

		myMethod2("Liam", 5);
		myMethod2("Jenny", 8);
		myMethod2("Anja", 31);

		System.out.println(myMethod3(3));
		System.out.println(myMethod4(5, 3));

		int z = myMethod5(5, 3);
		System.out.println(z);

		checkAge(20); // Call the checkAge method and pass along an age of 20
	}
}
