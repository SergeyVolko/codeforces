package org.example.level800.task617A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] steps = {5, 4, 3, 2, 1};
        int count = 0;
        int stepIndex = 0;
        while (x > 0) {
            if (x >= steps[stepIndex]) {
                x-= steps[stepIndex];
                count++;
            } else {
                stepIndex++;
            }
        }
        System.out.println(count);
    }
}
