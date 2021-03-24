package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {
	final String ONLY_LETTERS = "abcd efgh";
	final String ONLY_LETTERS_REVERSED = "dcba hgfe";
	final String LETTERS_AND_OTHER = "a1bcd efg!h";
	final String LETTERS_AND_OTHER_REVERSED = "d1cba hgf!e";

	
	@Test
	void testOnlyLetters() {
		WordReverser wordsTest = new WordReverser();
		assertEquals(ONLY_LETTERS_REVERSED, wordsTest.reverseWords(ONLY_LETTERS));
	}
	
	@Test
	void testLettersAndOther() {
		WordReverser wordsTest = new WordReverser();
		assertEquals(LETTERS_AND_OTHER_REVERSED, wordsTest.reverseWords(LETTERS_AND_OTHER));
	}
}
