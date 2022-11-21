package br.com.honda.HowTo;

public class HowToCountWords {

	public static void main(String[] args) {

		String words = "Onw two three four";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);

	}

}
