package am.picsart.lessons;

/**
 * @author Arshak Papoyan
 */

public class Lesson2 {

    public static void main(String[] args) {

        System.out.println("Task 1 : Create an array and fill it with 2 number");
        int[] arrayForTask1 = new int[57];
        for (int i = 0; i < arrayForTask1.length; i++) {
            arrayForTask1[i] = 2;
        }

        for (int i = 0; i < arrayForTask1.length; i++) {
            System.out.print(arrayForTask1[i] + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("Task 2 : Create an array and fill it with numbers from 1:1000");
        int[] arrayForTask2 = new int[1000];
        for (int i = 0; i < arrayForTask2.length; i++) {
            arrayForTask2[i] = i + 1;
        }

        for (int i = 0; i < arrayForTask2.length; i++) {
            System.out.print(arrayForTask2[i] + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("Task 3 : Create an array and fill it with odd numbers from -20:20");
        int[] arrayForTask3 = new int[20];
        for (int i = -19, index = 0; i < 20; i += 2, index++) {
            arrayForTask3[index] = i;
        }

        for (int i = 0; i < arrayForTask3.length; i++) {
            System.out.print(arrayForTask3[i] + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("Task 4 : Create an array and fill it. Print all elements which can be divided by 5");
        int[] arrayForTask4 = new int[500];
        for (int i = 0; i < arrayForTask4.length; i++) {
            arrayForTask4[i] = i;
        }
        for (int i = 0; i < arrayForTask4.length; i++) {
            boolean isDivisibleByFive = ((arrayForTask4[i] % 10) == 5) || ((arrayForTask4[i] % 10) == 0);
            if (isDivisibleByFive) {
                System.out.print(arrayForTask4[i] + " ");
            }
        }
        System.out.println();
        System.out.println();


        System.out.println("Task 5 : Create an array and fill it. Print all elements which are between 24.12 and 467.23");
        double[] arrayForTask5 = new double[50000];
        double value = 1.00;
        for (int i = 0; i < arrayForTask5.length; i++) {
            arrayForTask5[i] = value += 0.01;
        }
        for (int i = 0; i < arrayForTask5.length; i++) {
            boolean isInBounds = (arrayForTask5[i] > 24.12 && arrayForTask5[i] < 467.23);
            if (isInBounds) {
                System.out.print(arrayForTask5[i] + " ");
            }
        }
        System.out.println();
        System.out.println();


        System.out.println("Task 6 : Create an array and fill it. Print count of elements which can be divided by 2");
        int[] arrayForTask6 = {15, 88, 965, 1, 44, 8, 26, 59, 87, 41, 558, 774, 15, 9654, 147, 888, 98, 74};
        int count = 0;
        for (int i = 0; i < arrayForTask6.length; i++) {
            if (arrayForTask6[i] % 2 == 0) {
                count++;
            }
        }
        System.out.printf("Count of elements which can be divided by 2 is %d",count);
        System.out.println();
        System.out.println();


        System.out.println("Task 7\n" +
                "Given an integer, 0< N < 21 , print its first\n" +
                "10 multiples.\n" +
                "Each multiple N x i (where 0<i<11)\n" +
                "should be printed on a new line in the\n" +
                "form: N x i = result\n");

        int givenNumber = 8;
        for (int i = 1; i <= 10; i++) {
            int resultOfMultiplication = givenNumber * i;
            System.out.printf("%d X %d = %d\n", givenNumber, i, resultOfMultiplication);
        }
    }
}
