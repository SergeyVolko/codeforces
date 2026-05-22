package org.example.level800.task200B;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int j = scanner.nextInt();
            sum += j;
        }
        System.out.println((double) sum / n);
    }
}
