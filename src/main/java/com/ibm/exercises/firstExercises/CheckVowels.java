package com.ibm.exercises.firstExercises;

public class CheckVowels {

    public static void main(String[] args) {
        String someString = "vwls ";

        if (checkVowels(someString)){
            System.out.println("There are vowels in '" + someString + "'");
        }else {
            System.out.println("There are no vowels in '" + someString + "'");
        }
    }

    private static boolean checkVowels(String in){
        return in.toLowerCase().matches(".*[aeiou].*");
    }
}
