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
		assertEquals(ONLY_LETTERS_REVERSED, Anagram.reverseWords(ONLY_LETTERS));
	}
	
	@Test
	void testLettersAndOther() {
		assertEquals(LETTERS_AND_OTHER_REVERSED, Anagram.reverseWords(LETTERS_AND_OTHER));
	}

}
