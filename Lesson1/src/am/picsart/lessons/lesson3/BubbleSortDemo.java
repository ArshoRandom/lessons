package am.picsart.lessons.lesson3;

/**
 * @author Arshak Papoyan
 */

public class BubbleSortDemo {

    public void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "  ");
        }
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapByIndex(array,j,j+1);
                }
            }
        }
    }

    private void swapByIndex(int[] array, int index1, int index2){
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
