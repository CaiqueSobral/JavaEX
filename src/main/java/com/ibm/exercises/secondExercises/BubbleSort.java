package com.ibm.exercises.secondExercises;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numArr = {9, 3, 2, 5, 0, 8, 7, 1, 4, 6};

        System.out.println("==========================================");
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(numArr));

        System.out.println("\n==========================================");
        System.out.println("After sorting");
        bubbleSort(numArr);
    }

    private static void bubbleSort(int[] arr){

        boolean swap = false;

        for (int i = 0; i < arr.length; i++){
            swap = false;
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }

        System.out.println(Arrays.toString(arr));
    }

    /*
    private static void bubbleSort(int[] arr){
        boolean swap;

        for (int i = 0; i <= arr.length - 1; i++){
            swap = false;
            for (int j = i + 1; j <= arr.length - 1; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }

        System.out.println(Arrays.toString(arr));
    } */
}
