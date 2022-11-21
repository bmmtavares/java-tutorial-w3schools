package br.com.honda;

public class MultidimensionalArrays {

	public static void main(String[] args) {

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		int x = myNumbers[1][2];
		System.out.println(x);

		System.out.println("---");
		System.out.println("length:" + myNumbers.length);
		for (int i = 0; i < myNumbers.length; ++i) {
			System.out.println("i:" + i);
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println("j:" + j);
				System.out.println("tam:" + myNumbers[i].length);
				System.out.println(myNumbers[i][j]);
			}
		}

	}

}
