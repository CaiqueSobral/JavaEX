package com.ibm.exercises.firstExercises;

import java.util.Objects;

public class CheckPalindrome {

    public static void main(String[] args) {
        String word = "osso";

        System.out.println(checkPalindrome(word) ? word + " is a palindrome." : word + " is not a palindrome.");

        System.out.println("\n=====================================");
        System.out.println(checkPalindrome2(word));
    }

    private static boolean checkPalindrome(String in){
        return in.equals(new StringBuilder().append(in).reverse().toString());
    }

    private static boolean checkPalindrome2(String in){
        StringBuilder out = new StringBuilder();
        char[] charArray = in.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--){
            out.append(charArray[i]);
        }

        return in.equals(out.toString());
    }
}
