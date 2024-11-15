package org.example.level800.task339A;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String result = Arrays.stream(text.split("[+\\-*/]"))
                .sorted()
                .collect(Collectors.joining("+"));
        System.out.println(result);
    }
}
