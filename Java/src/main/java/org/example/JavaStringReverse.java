package org.example;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();  //madam //deed

        if (word.length() % 2 == 0) {
            evenWord(word);
        } else {
            oddCheck(word);
        }

    }

    private static void oddCheck(String word) {
        String firstPart = "";
        String secondPart = "";
        int middle = word.length() / 2;

        for (int i = 0; i < middle; i++) {
            firstPart += word.charAt(i);
        }

        for (int i = word.length() - 1; i >= middle + 1; i--) {
            secondPart += word.charAt(i);
        }

        if (firstPart.equals(secondPart)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static void evenWord(String word) {
        String firstPart = "";
        String secondPart = "";
        int middle = word.length() / 2;

        for (int i = 0; i < middle; i++) {
            firstPart += word.charAt(i);
        }

        for (int i = word.length() - 1; i >= middle; i--) {
            secondPart += word.charAt(i);
        }

        if (firstPart.equals(secondPart)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



