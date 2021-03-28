package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WordReverserTest {

    private static final String NULL = null;
    private static final String EMPTY_STRING = "";

    private static final String ONLY_LETTERS = "abcd efgh";
    private static final String ONLY_LETTERS_REVERSED = "dcba hgfe";

    private static final String ONLY_NUMBERS = "123 9856";
    private static final String ONLY_SPEC_SYMBOLS = "+@#& ';)]}";

    private static final String LETTERS_AND_NUMBERS = "tr1d5 qwer8ty";
    private static final String LETTERS_AND_NUMBERS_REVERSED = "dr1t5 ytre8wq";

    private static final String LETTERS_AND_SYMBOLS = "ab@c% d*e)__=fg";
    private static final String LETTERS_AND_SYMBOLS_REVERSED = "cb@a% g*f)__=ed";

    private static final String NUMBERS_AND_SYMBOLS = "32@67% 89*1)_ _=78";

    private static final String LETTERS_AND_OTHER = "a1b(cd ef&g!h";
    private static final String LETTERS_AND_OTHER_REVERSED = "d1c(ba hg&f!e";

    private static WordReverser testPhrase;

    @BeforeAll
    static void init() {
        testPhrase = new WordReverser();
    }

    @Test
    @DisplayName ("test null input")
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> testPhrase.reverseWords(NULL));
    }

    @Test
    @DisplayName("test empty string input")
    void testEmptyString() {
        assertEquals(EMPTY_STRING, testPhrase.reverseWords(EMPTY_STRING));
    }

    @Test
    @DisplayName("test input of a phrase only from letters")
    void testOnlyLetters() {
        assertEquals(ONLY_LETTERS_REVERSED, testPhrase.reverseWords(ONLY_LETTERS));
    }

    @Test
    @DisplayName("test input of a phrase only from numbers")
    void testOnlyNumbers() {
        assertEquals(ONLY_NUMBERS, testPhrase.reverseWords(ONLY_NUMBERS));
    }

    @Test
    @DisplayName("test input of a phrase only from special symbols")
    void testOnlySpecSymbols() {
        assertEquals(ONLY_SPEC_SYMBOLS, testPhrase.reverseWords(ONLY_SPEC_SYMBOLS));
    }

    @Test
    @DisplayName("test input of a phrase from letters and numbers")
    void testLettersAndNumbers() {
        assertEquals(LETTERS_AND_NUMBERS_REVERSED, testPhrase.reverseWords(LETTERS_AND_NUMBERS));
    }

    @Test
    @DisplayName("test input of a phrase from letters and special symbols")
    void testLettersAndSymbols() {
        assertEquals(LETTERS_AND_SYMBOLS_REVERSED, testPhrase.reverseWords(LETTERS_AND_SYMBOLS));
    }

    @Test
    @DisplayName("test input of a phrase from numbers and special symbols")
    void testNumbersAndSymbols() {
        assertEquals(NUMBERS_AND_SYMBOLS, testPhrase.reverseWords(NUMBERS_AND_SYMBOLS));
    }

    @Test
    @DisplayName("test input of a phrase from letters, numbers and special symbols")
    void testLettersAndOther() {
        assertEquals(LETTERS_AND_OTHER_REVERSED, testPhrase.reverseWords(LETTERS_AND_OTHER));
    }
}
