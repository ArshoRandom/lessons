package am.picsart.lessons.lesson3;

import java.util.Arrays;

/**
 * @author Arshak Papoyan
 */

public class SortingAlgorithmsDemo{


    public static void printArray(int[] array) {

        for (int element : array) {
            System.out.print(element + "  ");
        }
    }

    public static void bubbleSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapByIndex(array, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        if (arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]> arr[j]){
                    swapByIndex(arr,i,j);
                }
            }
        }

    }

    public static void insertionSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                for (int j = 0; j <= i; j++) {
                    if (arr[j] > arr[i + 1]) {
                        swapByIndex(arr, j, i + 1);
                    }
                }
            }
        }

    }

    private static void swapByIndex(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static int[] mergeSort(int[] array) {

        if (array.length >= 2) {
            int[] left = new int[array.length >> 1];
            int[] right = new int[array.length - left.length];

            for (int i = 0; i < left.length; i++) {
                left[i] = array[i];
            }

            int rightIndex = left.length;
            for (int i = 0; i < right.length; i++) {
                right[i] = array[rightIndex++];
            }

            return merge(mergeSort(left), mergeSort(right));
        }
        return array;
    }

    private static int [] merge(int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int[] array = new int[left.length + right.length];

        for (int i = 0; i < array.length; i++) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] <= right[rightIndex]) {
                    array[i] = left[leftIndex++];
                } else {
                    array[i] = right[rightIndex++];
                }
            } else if (leftIndex < left.length) {
                array[i] = left[leftIndex++];
            } else {
                array[i] = right[rightIndex++];
            }
        }
        return array;

    }
}
