package com.ibm.exercises.secondExercises;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 9;
        int high = arr.length - 1;

        int index = binarySearchRecursive(arr, x, 0, high);

        System.out.println("=========================================================");
        System.out.println("Recursive Method\n");
        if (index == -1) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println(Arrays.toString(arr));
            System.out.println("Value " + x + " is at index " + index);
        }

        System.out.println("\n=========================================================");
        System.out.println("Iterative Method\n");
        index = binarySearchIterative(arr, x, 0, high);

        if (index == -1) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println(Arrays.toString(arr));
            System.out.println("Value " + x + " is at index " + index);
        }

        System.out.println("\n=========================================================");
    }

    private static Integer binarySearchRecursive(int[] arr, int x, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            return mid;
        } else {
            if (arr[mid] < x) return binarySearchRecursive(arr, x, mid + 1, high);

            if (arr[mid] > x) return binarySearchRecursive(arr, x, low, mid - 1);
        }

        return -1;
    }

    private static Integer binarySearchIterative(int[] arr, int x, int low, int high) {
        if (low > high) return -1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == x) return mid;

            if (arr[mid] < x) low = mid + 1;
            if (arr[mid] > x) high = mid - 1;
        }

        return -1;
    }

}
