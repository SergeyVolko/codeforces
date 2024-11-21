package org.example.level800.task41A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = new StringBuilder(scanner.nextLine()).reverse().toString();
        if (first.equals(second)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
