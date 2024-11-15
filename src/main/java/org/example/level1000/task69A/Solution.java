package org.example.level1000.task69A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;
        for (int i = 0; i < n; i++) {
            String[] textArr = scanner.nextLine().split(" ");
            sumX += Integer.parseInt(textArr[0]);
            sumY += Integer.parseInt(textArr[1]);
            sumZ += Integer.parseInt(textArr[2]);
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
