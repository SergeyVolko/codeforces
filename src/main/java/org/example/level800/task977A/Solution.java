package org.example.level800.task977A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] condition = scanner.nextLine().split(" ");
        int n = Integer.parseInt(condition[0]);
        int k = Integer.parseInt(condition[1]);
        while (k > 0) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
            k--;
        }
        System.out.println(n);
    }
}
