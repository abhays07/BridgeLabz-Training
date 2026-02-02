package com.advancedquestions.lexicaltwist;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LexicalTwist {

    // Reverse first word, lowercase it, replace vowels with '@'
    public static String reverse(String word) {
        StringBuilder sb = new StringBuilder(word).reverse();
        StringBuilder replacedString = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                replacedString.append('@');
            } else {
                replacedString.append(ch);
            }
        }
        return replacedString.toString();
    }

    // Check if second word is reverse of first (case-insensitive)
    public static boolean isReversed(String first, String second) {
        String reversed = new StringBuilder(first).reverse().toString();
        return reversed.equalsIgnoreCase(second);
    }

    // Combine words and convert to uppercase
    public static String combine(String first, String second) {
        return (first + second).toUpperCase();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Word");
        String first = scanner.nextLine();
        if (first.contains(" ")) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter Second Word");
        String second = scanner.nextLine();
        if (second.contains(" ")) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // Case 1: reversed
        if (isReversed(first, second)) {
            System.out.println(reverse(first));
        }
        // Case 2: not reversed
        else {

            int vowelCount = 0;
            int consonantCount = 0;
            String combinedWord = combine(first, second);

            // Count vowels and consonants
            for (int i = 0; i < combinedWord.length(); i++) {
                char ch = combinedWord.charAt(i);

                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            Set<Character> uniqueCharacters = new LinkedHashSet<>();

            // More vowels
            if (vowelCount > consonantCount) {
                for (int i = 0; i < combinedWord.length(); i++) {
                    char ch = combinedWord.charAt(i);
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        uniqueCharacters.add(ch);
                        if (uniqueCharacters.size() == 2)
                            break;
                    }
                }
                for (Character c : uniqueCharacters) {
                    System.out.print(c);
                }
            }

            // More consonants
            else if (consonantCount > vowelCount) {
                for (int i = 0; i < combinedWord.length(); i++) {
                    char ch = combinedWord.charAt(i);
                    if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                        uniqueCharacters.add(ch);
                        if (uniqueCharacters.size() == 2)
                            break;
                    }
                }
                for (Character c : uniqueCharacters) {
                    System.out.print(c);
                }
            }

            // Equal
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
