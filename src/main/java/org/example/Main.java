package org.example;

public class Main {
    public static void main(String[] args) {
        int year = 1987; // Например, заданный год
        int nextUniqueYear = findNextUniqueYear(year);
        System.out.println("Наименьший номер года, который строго больше " + year + " и все цифры в котором различны: " + nextUniqueYear);
    }

    public static int findNextUniqueYear(int year) {
        do {
            year++; // проверяем следующий год
        } while (!hasUniqueDigits(year));
        return year;
    }

    private static boolean hasUniqueDigits(int year) {
        boolean[] digitPresent = new boolean[10]; // массив для отслеживания наличия цифр
        while (year > 0) {
            int digit = year % 10; // берем последнюю цифру
            if (digitPresent[digit]) { // если цифра уже встречалась, возвращаем false
                return false;
            }
            digitPresent[digit] = true; // помечаем цифру как встречавшуюся
            year /= 10; // убираем последнюю цифру
        }
        return true; // если все цифры уникальны
    }
}