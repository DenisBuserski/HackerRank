package org.example;

import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = i * n;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
