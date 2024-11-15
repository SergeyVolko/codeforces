package org.example.level800.task546A;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] condition = scanner.nextLine().split(" ");
        int k = Integer.parseInt(condition[0]);
        int n = Integer.parseInt(condition[1]);
        int w = Integer.parseInt(condition[2]);
        int totalSum = IntStream.rangeClosed(1, w).sum() * k;
        int result = 0;
        if (totalSum > n) {
            result = totalSum - n;
        }
        System.out.println(result);
    }
}
