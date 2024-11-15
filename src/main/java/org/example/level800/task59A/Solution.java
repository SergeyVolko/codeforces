package org.example.level800.task59A;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        Matcher lowerCaseMatcher = lowerCasePattern.matcher(text);
        int lowerCaseCount = 0;
        while (lowerCaseMatcher.find()) {
            lowerCaseCount++;
        }

        if (lowerCaseCount >= text.length() - lowerCaseCount) {
            text = text.toLowerCase();
        } else {
            text = text.toUpperCase();
        }
        System.out.println(text);
    }
}
