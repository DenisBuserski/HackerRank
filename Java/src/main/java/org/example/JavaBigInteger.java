package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        BigInteger number1 = new BigInteger(input1);
        BigInteger number2 = new BigInteger(input2);


        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
    }
}
