package com.ibm.exercises.firstExercises;

public class Factorial {

    public static void main(String[] args){
        int number = 2;

        System.out.println("Result of " + number + "! = " + calculateFactorial(number));
    }

    private static Integer calculateFactorial(int number){
        int result = 1;

        if (number < 0) return 0;

        if (number == 0 || number == 1) return 1;

        for (int i = number; i >= 2; i--){
            result *= i;
        }

        return result;
    }
}
