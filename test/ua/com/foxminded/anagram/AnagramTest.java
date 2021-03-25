package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AnagramTest {
    private static final String ONLY_LETTERS = "abcd efgh";
    private static final String ONLY_LETTERS_REVERSED = "dcba hgfe";
    private static final String LETTERS_AND_OTHER = "a1bcd efg!h";
    private static final String LETTERS_AND_OTHER_REVERSED = "d1cba hgf!e";
    private static WordReverser wordsTest;

    @BeforeAll
    static void init() {
        wordsTest = new WordReverser();
    }

    @Test
    void testOnlyLetters() {
        assertEquals(ONLY_LETTERS_REVERSED, wordsTest.reverseWords(ONLY_LETTERS));
    }

    @Test
    void testLettersAndOther() {
        assertEquals(LETTERS_AND_OTHER_REVERSED, wordsTest.reverseWords(LETTERS_AND_OTHER));
    }
}
