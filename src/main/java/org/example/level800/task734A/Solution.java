package org.example.level800.task734A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String parties = scanner.nextLine();
        int anton = 0;
        int dan = 0;
        for (String s : parties.split("")) {
            if ("A".equals(s)) {
                anton++;
            } else {
                dan++;
            }
        }

        if (anton == dan) {
            System.out.println("Friendship");
        } else if (anton > dan) {
            System.out.println("Anton");
        } else {
            System.out.println("Danik");
        }
    }
}
