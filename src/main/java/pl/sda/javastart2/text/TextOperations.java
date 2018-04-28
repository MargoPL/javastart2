package pl.sda.javastart2.text;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class TextOperations {

    public static void main(String[] args) {
        int iterations = 1_000_000;
        String abc = "abc";
//        classicConcat(abc, iterations);
        builderConcat(abc, iterations);
        isAnagram("element", "\"tnemele\" ");
        isPalindrom("kajak");
    }

    private static void isPalindrom(String word) {
        System.out.println(word.equals(new StringBuilder(word).reverse().toString()));
    }

    private static void isAnagram(String word1, String word2) {
        word1 = word1.replaceAll("\\W", "").toLowerCase();
        word2 = word2.replaceAll("\\W", "").toLowerCase();

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean result = Arrays.equals(chars1, chars2);
        System.out.println(result);

    }

    private static void builderConcat(String text, int iterations) {
        Instant start = Instant.now();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        System.out.println(Duration.between(start, Instant.now()));
    }

    private static void classicConcat(String text, int iterations) {
        Instant start = Instant.now();
        String resut = "";
        for (int i = 0; i < iterations; i++) {
            resut += text;
        }
        System.out.println(Duration.between(start, Instant.now()));
        System.out.println(resut);
    }
}
