package ua.com.foxminded.anagram;

public class WordReverser {

	public String reverseWords(String input) {
		int i = 0;
		final String SEPARATOR_WORDS = " ";
		String inputWords[] = input.split(SEPARATOR_WORDS);
		String outputWords[] = new String[inputWords.length];

		for (String inputWord : inputWords) {
			outputWords[i] = reverseWord(inputWord);
			i++;
		}
		return String.join(SEPARATOR_WORDS, outputWords);
	}

	public String reverseWord(String word) {
		StringBuilder onlyLetterWord = new StringBuilder();
		for (int j = 0; j < word.length(); j++) {
			if (Character.isLetter(word.charAt(j))) {
				onlyLetterWord.append(word.charAt(j));
			}
		}
		onlyLetterWord.reverse();
		for (int j = 0; j < word.length(); j++) {
			if (!Character.isLetter(word.charAt(j))) {
				onlyLetterWord.insert(j, word.charAt(j));
			}
		}

		return onlyLetterWord.toString();
	}
}
