package edu.agh.ics.jtplab;

public class EvenNumbers {

    private static void printEven(int upperBound) {
        for (int i = 0; i <= upperBound; i += 2) {
            System.out.println(i);
        }
    }

    private static void printEvenBitCheck(int upperBound) {
        for (int i = 0; i <= upperBound; i++) {
            if ((i & 1) == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printEvenBitCheck(1024);
    }
}
