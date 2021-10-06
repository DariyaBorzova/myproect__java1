package lesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        nullArray();
        changeArray();
        arrDiagonal();
        lastTask(5, 9);
    }

    public static void invertArray() {
        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void nullArray() {
        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrDiagonal() {
        int[][] deepData = new int[10][10];
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                if (i == j) {
                    deepData[i][j] = 1;
                }
                System.out.print(deepData[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void lastTask(int len, int initialValue) {
        int[] arrValue = new int[len];
        for (int i = 0; i < arrValue.length; i++) {
            arrValue[i]=initialValue;
            System.out.print(arrValue[i] + " ");
        }
    }
}
