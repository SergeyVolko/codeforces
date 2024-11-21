package org.example.level800.task266B;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nt = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nt[0]);
        int t = Integer.parseInt(nt[1]);
        String[] queue = scanner.nextLine().split("");
        int l = Math.min(t, n);
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n - 1; j++) {
                if ("B".equals(queue[j]) && "G".equals(queue[j + 1])) {
                    String tmp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = tmp;
                    j++;
                }
            }
        }
        System.out.println(String.join("", queue));
    }
}
