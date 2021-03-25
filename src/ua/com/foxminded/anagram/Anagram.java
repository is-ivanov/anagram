package ua.com.foxminded.anagram;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        String inputText;

        Scanner in = new Scanner(System.in);
        System.out.println("Input text for anagram: ");
        inputText = in.nextLine();
        in.close();

        WordReverser wordsForReverse = new WordReverser();

        System.out.println(wordsForReverse.reverseWords(inputText));
    }
}
