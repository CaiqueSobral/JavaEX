package com.ibm.exercises.secondExercises;

public class MiddleLetter {

    /*
    Baseado nas palavras abaixo, me mostre qual é a letra do meio de cada palavras:
    string palavras = [uva, otorrinolaringologista, pneumoultramicoscopicosilicovulcaniconiotico,laranja,pera];
    */

    public static void main(String[] args) {
        String[] palavras = {"uva", "otorrinolaringologista", "pneumoultramicoscopicosilicovulcaniconiotico", "laranja", "pera"};

        for (String word : palavras) {
            System.out.println(findMiddleLetter(word));
        }
    }

    private static String findMiddleLetter(String word) {
        String letter;
        int mid = word.length() / 2;

        if (word.length() % 2 != 0) {
            letter = String.valueOf(word.toCharArray()[mid]);
            return "\nThe middle letter of '" + word + "' is: '" + letter + "'";
        } else {
            letter = ""+word.toCharArray()[mid-1] + word.toCharArray()[mid];
            return "\nThe length of the word '"+ word + "' is even, so the middle letters are: '" + letter + "'";
        }
    }
}
