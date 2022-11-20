package com.ibm.exercises.firstExercises;

public class ReverseString {
    public static void main(String[] args) {
        String someString = "string";

        System.out.println("Normal string: " + someString);
        System.out.println("Reversed String: " + reverseString(someString));

        System.out.println("============================");
        System.out.println("Reversed string 2: " + reverseString2(someString));
    }

    private static String reverseString(String in){
        if (in == null){
            return "Null is not an option";
        }else{
            return new StringBuilder().append(in).reverse().toString();
        }
    }

    private static String reverseString2(String in){
        if (in == null) return "null is not an option";

        char[] charArray = in.toCharArray();
        StringBuilder out = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--){
            out.append(charArray[i]);
        }

        return out.toString();
    }
}