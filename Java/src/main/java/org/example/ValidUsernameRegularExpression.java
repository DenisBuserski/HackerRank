package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String input  = scanner.nextLine();

            String regex = "^[a-zA-Z]\\w{7,29}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

    }
}
