package org.example.level800.task236A;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Arrays.stream(scanner.next().split(""))
                .collect(Collectors.toSet())
                .size();
        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
