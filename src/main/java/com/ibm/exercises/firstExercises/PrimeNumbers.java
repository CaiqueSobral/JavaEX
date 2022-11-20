package com.ibm.exercises.firstExercises;

public class PrimeNumbers {

    public static void main(String[] args) {

        int finalNumber = 100;

        for (int i = 0; i <= finalNumber; i++) {
            if(checkPrime(i)) System.out.println(i);
        }
    }

    private static boolean checkPrime(int number) {
        if (number == 0 || number == 1) return false;

        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
