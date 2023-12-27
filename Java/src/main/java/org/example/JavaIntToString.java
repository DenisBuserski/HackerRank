package org.example;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String nValue = Integer.toString(n);

        if (n == Integer.parseInt(nValue)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
