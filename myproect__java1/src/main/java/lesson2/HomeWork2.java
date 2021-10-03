package lesson2;

import java.util.zip.Checksum;

public class HomeWork2 {
    public static void main(String[] args) {
       CheckSum(11, 2);
       CheckVar(-89);
        isNegative(7);
        printWords("Печатаем строку", 4);
    }

    public static boolean CheckSum(int x, int y) {
        int sum = x + y;
        if ((sum >= 10) && (sum <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void CheckVar(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (x >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printWords(String words, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(words);
        }
    }
}

