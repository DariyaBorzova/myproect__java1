package lesson2;

import java.util.zip.Checksum;

public class HomeWork2 {
    public static void main(String[] args){
        CheckSum();
        CheckVar();
    }

    public static void CheckSum() {
        int VarA=20;
        int VarB=40;
        int Sum=(VarA + VarB);
        if (Sum >=10 && Sum <= 20){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void CheckVar() {
        int VarA=67;
        if (VarA >= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
}
