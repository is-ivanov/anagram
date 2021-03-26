package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AnagramTest {

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

//    null (NPE), пустая строка(+), строка только из букв(+), строка только из цифр(+), строка только из
//    спец символов(+), буквы+цифры(+), буквы+символы(+), цифры+символы(+),
//    буквы+цифры+символы.

    @BeforeAll
    static void init() {
        testPhrase = new WordReverser();
    }

    @Test
    void testNull() {
        assertEquals(NULL, testPhrase.reverseWords(NULL));
    }

    @Test
    void testEmptyString() {
        assertEquals(EMPTY_STRING, testPhrase.reverseWords(EMPTY_STRING));
    }

    @Test
    void testOnlyLetters() {
        assertEquals(ONLY_LETTERS_REVERSED, testPhrase.reverseWords(ONLY_LETTERS));
    }

    @Test
    void testOnlyNumbers() {
        assertEquals(ONLY_NUMBERS, testPhrase.reverseWords(ONLY_NUMBERS));
    }

    @Test
    void testOnlySpecSymbols() {
        assertEquals(ONLY_SPEC_SYMBOLS, testPhrase.reverseWords(ONLY_SPEC_SYMBOLS));
    }

    @Test
    void testLettersAndNumbers() {
        assertEquals(LETTERS_AND_NUMBERS_REVERSED, testPhrase.reverseWords(LETTERS_AND_NUMBERS));
    }

    @Test
    void testLettersAndSymbols() {
        assertEquals(LETTERS_AND_SYMBOLS_REVERSED, testPhrase.reverseWords(LETTERS_AND_SYMBOLS));
    }

    @Test
    void testNumbersAndSymbols() {
        assertEquals(NUMBERS_AND_SYMBOLS, testPhrase.reverseWords(NUMBERS_AND_SYMBOLS));
    }

    @Test
    void testLettersAndOther() {
        assertEquals(LETTERS_AND_OTHER_REVERSED, testPhrase.reverseWords(LETTERS_AND_OTHER));
    }
}
