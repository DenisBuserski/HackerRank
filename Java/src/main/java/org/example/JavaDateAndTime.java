package org.example;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateAndTime.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

        return dayOfWeek.name();
    }
}
