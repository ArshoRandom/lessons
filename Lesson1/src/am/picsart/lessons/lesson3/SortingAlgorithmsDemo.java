package am.picsart.lessons.lesson3;

/**
 * @author Arshak Papoyan
 */

public class SortingAlgorithmsDemo {

    public void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "  ");
        }
    }

    public void bubbleSort(int[] array) {
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

    public void selectionSort(int[] arr){
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

    public void insertionSort(int[] arr) {
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

    private void swapByIndex(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
