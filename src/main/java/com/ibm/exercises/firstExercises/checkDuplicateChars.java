package com.ibm.exercises.firstExercises;

import java.util.HashMap;
import java.util.Map;

public class checkDuplicateChars {

    public static void main(String[] args) {
        String str = "aabcdeffgghh";

        checkTheDuplicateChars(str);
    }

    private static void checkTheDuplicateChars(String in){
        char[] charArray = in.toCharArray();

        System.out.println("Duplicate chars \n");
        for (int i = 0; i <= in.length() - 1; i++){
            for (int j = i+1; j <= charArray.length - 1; j++){
                if (charArray[i] == charArray[j]){
                    System.out.println(charArray[j]);
                    break;
                }
            }
        }
    }
}
