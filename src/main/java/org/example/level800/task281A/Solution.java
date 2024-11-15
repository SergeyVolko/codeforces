package org.example.level800.task281A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(text.substring(0, 1).toUpperCase() + text.substring(1));
    }
}
