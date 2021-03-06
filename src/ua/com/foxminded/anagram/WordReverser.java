package ua.com.foxminded.anagram;

import java.util.Objects;

public class WordReverser {
    public static final String MESSAGE_NULL_EXCEPTION = "Line is null";
    public static final String SEPARATOR_WORDS = " ";

    public String reverseWords(String input) {
        if (Objects.isNull(input)) {
            throw new IllegalArgumentException(MESSAGE_NULL_EXCEPTION);
        }
        int i = 0;
        String[] inputWords = input.split(SEPARATOR_WORDS);
        String[] outputWords = new String[inputWords.length];

        for (String inputWord : inputWords) {
            outputWords[i] = reverseWord(inputWord);
            i++;
        }
        return String.join(SEPARATOR_WORDS, outputWords);
    }

    private String reverseWord(String word) {
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
