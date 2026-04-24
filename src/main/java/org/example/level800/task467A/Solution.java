package org.example.level800.task467A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rooms = 0;
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            int q = in.nextInt();
            if (q - p >= 2) {
                rooms++;
            }
        }
        System.out.println(rooms);
    }
}
