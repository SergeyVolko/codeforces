package org.example.level800.task110A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("[^47]", "");
        String m = String.valueOf(input.length());
        m = m.replaceAll("[47]", "");
        if (m.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
