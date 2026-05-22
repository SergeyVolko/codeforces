package org.example.level800.task344A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prev = "";
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if (!prev.equals(s)) {
                prev = s;
                count++;
            }
        }
        System.out.println(count);
    }
}
