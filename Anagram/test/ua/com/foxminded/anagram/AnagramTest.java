package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void testOnlyLetters() {
		assertEquals("dcba hgfe", Anagram.reverseWords("abcd efgh"));
	}
	@Test
	void testLettersAndNonLetters() {
		assertEquals("d1cba hgf!e", Anagram.reverseWords("a1bcd efg!h"));
	}

}
