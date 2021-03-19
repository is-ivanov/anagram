package ua.com.foxminded.anagram;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input text for anagram: ");
		String inputText = in.nextLine();
		in.close();
		System.out.println(reverseWords(inputText));
	}

	public static String reverseWords(String input) {
		int i = 0;
		String inputWords[] = input.split(" ");
		String outputWords[] = new String[inputWords.length];

		for (String inputWord : inputWords) {
			StringBuilder onlyLetterWord = new StringBuilder();
			for (int j = 0; j < inputWord.length(); j++) {
				if (Character.isLetter(inputWord.charAt(j))) {
					onlyLetterWord.append(inputWord.charAt(j));
				}
			}
			onlyLetterWord.reverse();
			for (int j = 0; j < inputWord.length(); j++) {
				if (!Character.isLetter(inputWord.charAt(j))) {
					onlyLetterWord.insert(j, inputWord.charAt(j));
				}
			}

			String reverse = onlyLetterWord.toString();
			outputWords[i] = reverse;
			i++;
		}
		return String.join(" ", outputWords);
	}
}
