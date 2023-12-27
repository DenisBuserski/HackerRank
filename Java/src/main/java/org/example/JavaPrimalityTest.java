package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.nextLine());

        boolean probablePrime = number.isProbablePrime(1);

        if (probablePrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}
