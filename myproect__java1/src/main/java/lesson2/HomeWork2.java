package lesson2;

import java.util.zip.Checksum;

public class HomeWork2 {
    public static void main(String[] args) {
        CheckSum(11, 2);
        CheckVar(-89);
        isNegative(7);
        printWords("Печатаем строку", 5);
    }

    public static void CheckSum(int x, int y) {
        int sum = x + y;
        if ((sum >= 10) && (sum <= 20)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void CheckVar(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void isNegative(int x) {
        if (x >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void printWords(String words, int times) {
        for (int i = 0; i < 5; i++) {
            System.out.println(words);
        }
    }
}

