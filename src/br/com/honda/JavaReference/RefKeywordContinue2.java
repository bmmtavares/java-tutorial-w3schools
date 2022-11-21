package br.com.honda.JavaReference;

public class RefKeywordContinue2 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 10) {
			if (i == 4) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}

//OK-CONTINUAR EM: https://www.w3schools.com/java/ref_keyword_default.asp
