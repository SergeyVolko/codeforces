package org.example.level800.task266A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String[] stones = scanner.nextLine().split("");
        int result = 0;
        for (int i = 0; i < stones.length - 1; i++) {
            if (stones[i].equals(stones[i + 1])) {
                result++;
            }
        }
        System.out.println(result);
    }
}
