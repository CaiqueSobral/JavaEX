package com.ibm.exercises.firstExercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingWords {

    public static void main(String[] args) {

        String str = "Subi no onibus e depois subi umas escadas para chegar em outro onibus";

        System.out.println(checkNumberOfWords(str));
    }

    private static String checkNumberOfWords(String in){

        Map<String, Integer> wordsHashMap = new HashMap<>();
        String[] wordsArray = in.toLowerCase().split(" ");

        for(int i = 0; i <= wordsArray.length - 1; i++){
            if (wordsHashMap.containsKey(wordsArray[i])){
                int count = wordsHashMap.get(wordsArray[i]);
                wordsHashMap.put(wordsArray[i], count + 1);
            }else{
                wordsHashMap.put(wordsArray[i], 1);
            }
        }

        return wordsHashMap.toString();
    }
}
