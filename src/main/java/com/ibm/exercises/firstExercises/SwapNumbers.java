package com.ibm.exercises.firstExercises;

public class SwapNumbers {

    public static void main(String[] args) {

        System.out.println("====================================");

        int a = 10;
        int b = 5;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int pseudo;

        pseudo = a;
        a = b;
        b = pseudo;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("\n====================================");
        System.out.println("Without a third variable\n");

        a = 10;
        b = 50;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a + b; // 33
        b = a - b; // 20
        a = a - b; // 13
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
