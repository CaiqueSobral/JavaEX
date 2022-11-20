package com.ibm.exercises.firstExercises;

public class CheckEvenNumber {

    public static void main(String[] args) {
        int number = 11;

        if (checkEvenNumber(number)){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is an even number");
        }
    }

    private static boolean checkEvenNumber(int number){
        return number % 2 == 0;
    }
}
