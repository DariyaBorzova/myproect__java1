package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        PrintThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int varA = -56;
        int varB = -108;
        int sum = (varA + varB);
        System.out.println(sum);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 67;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int varA = 89;
        int varB = 89;
        if (varA >= varB){
            System.out.println("a>=b");
        }
        if (varA < varB){
            System.out.println("a<b");
        }
    }
}
