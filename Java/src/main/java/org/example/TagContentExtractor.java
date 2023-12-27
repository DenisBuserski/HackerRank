package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            String regexPattern = "<(.+)>([\\w]+[^<]*)</(\\1)>";
            Pattern pattern = Pattern.compile(regexPattern);
            Matcher matcher = pattern.matcher(line);
            int count = 0;

            while (matcher.find()) {
                // System.out.println(matcher.group(0)); // get <h1>...</h1>
                // System.out.println(matcher.group(1)); // get the text inside the tag
                System.out.println(matcher.group(2)); // get the text between <x> </x>
                count++;
            }

            if (count == 0) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
