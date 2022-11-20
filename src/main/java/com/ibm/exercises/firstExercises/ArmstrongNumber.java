package com.ibm.exercises.firstExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }

    private static String armstrongNumber(int number){
        char[] numberAsCharArray = Integer.toString(number).toCharArray();
        int sum = 0;

        for (char i : numberAsCharArray){
            sum += Math.pow(Character.getNumericValue(i), 3);
        }

        return sum == number ? number + " is an armstrong number" : number + " is not an armstrong number";
    }
}


