package org.example.level800.task791A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        int a = Integer.parseInt(text[0]);
        int b = Integer.parseInt(text[1]);
        int count = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            count++;
        }
        System.out.println(count);
    }
}
