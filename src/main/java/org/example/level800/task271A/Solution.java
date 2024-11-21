package org.example.level800.task271A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        do {
            year++;
        } while (!isUnique(year));

        System.out.println(year);
    }

    private static boolean isUnique(int year) {
        boolean[] digits = new boolean[10];
        while (year > 0) {
            int digit = year % 10;
            if (digits[digit]) {
                return false;
            }
            digits[digit] = true;
            year /= 10;
        }
        return true;
    }
}
