package org.example;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] numbers = scanner.nextLine().split("\\s+");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        String output = input.substring(a, b);
        System.out.println(output);
    }
}
