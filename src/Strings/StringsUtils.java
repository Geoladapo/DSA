package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringsUtils {
    public static int countVowels(String str) {

        int count = 0;
        String vowels = "aeiou";
        for (var ch : str.toLowerCase().toCharArray()) {
            if (vowels.contains(Character.toString(ch))) {
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String reverse(String str) {
        if (str == null) {
            return "";
        }

        StringBuilder reversed = new StringBuilder();
        for (var i = str.length(); i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (var i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i] + " ");
        }
        return reversed.toString().trim();
    }

    public static boolean areRotations(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        if (!(str1 + str2).contains(str2)) {
            return false;

        }
        return true;
    }

    public static String removeDuplicates(String str) {
        if (str == null) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (var ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static char getMaxOccuringChar(String str) {

        if(str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }

        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];

        for (var ch : str.toCharArray()) {
            frequencies[ch]++;
        }

        int max = 0;
        char result = ' ';
        for (var i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }
        }
        return result;
    }
}
