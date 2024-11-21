package org.example.level800.task677A;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nh = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nh[0]);
        int h = Integer.parseInt(nh[1]);
        int result = n + (int) Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(e -> e > h).count();
        System.out.println(result);
    }
}
