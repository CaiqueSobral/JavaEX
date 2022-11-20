package com.ibm.exercises.firstExercises;

public class RemoveWhiteSpacesFromString {

    public static void main(String[] args) {
        String someString = "subi no onibus";

        System.out.println(removeWhiteSpaces(someString));
    }

    private static String removeWhiteSpaces(String in){
        StringBuilder out = new StringBuilder();

        char[] charArray = in.toCharArray();

        for (char i : charArray){
            if (!Character.isWhitespace(i)) out.append(i);
        }

        return out.toString();
    }
}
