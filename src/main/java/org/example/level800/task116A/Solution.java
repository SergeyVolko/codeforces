package org.example.level800.task116A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 0;
        int maxCapacity = 0;
        for (int i = 0; i < n; i++) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            capacity = capacity - a + b;
            if (capacity > maxCapacity) {
                maxCapacity = capacity;
            }
        }
        System.out.println(maxCapacity);
    }
}
