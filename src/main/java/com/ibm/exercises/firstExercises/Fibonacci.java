package com.ibm.exercises.firstExercises;

public class Fibonacci {

    public static void main(String[] args) {

        int number = 100;
        int a = 0, b = 1;

        for (int c = 0; c <= number; c = a + b) {
            System.out.println(c);

            a = b;
            b = c;
        }
    }
}
