package br.com.honda.Methods;

public class Recursion {

	public static void main(String[] args) {

		int result = sum(10);
		System.out.println(result);

		result = sum2(5, 10);
		System.out.println(result);

	}

	public static int sum(int k) {

		/*
		 * Example Explained When the sum() function is called, it adds
		 * parameter k to the sum of all numbers smaller than k and returns the
		 * result. When k becomes 0, the function just returns 0. When running,
		 * the program follows these steps:
		 * 
		 * 10 + sum(9) 10 + ( 9 + sum(8) ) 10 + ( 9 + ( 8 + sum(7) ) ) ... 10 +
		 * 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0) 10 + 9 + 8 + 7 + 6 + 5 + 4
		 * + 3 + 2 + 1 + 0 = 55 Since the function does not call itself when k
		 * is 0, the program stops there and returns the result.
		 */

		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

	public static int sum2(int start, int end) {

		/*
		 * 
		 * Teste de Mesa, comeca com 5,10 10 + (5,9) 9 + (5,8) 8 + (5,7) 7 +
		 * (5,6) 6 + (5,5) 5 =10+9+8+7+6+5=45
		 */

		if (end > start) {
			return end + sum2(start, end - 1);
		} else {
			return end;
		}
	}

}
