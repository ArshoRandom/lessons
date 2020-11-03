package am.picsart.lessons.lesson3;

/**
 * @author Arshak Papoyan
 */

public class Lesson3 {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.setBrand("ASUS");
        computer.setModel("ZenBook 15");
        computer.setCpuCount(4);
        computer.setRam(8);
        computer.setNotebook(true);

        computer.printComputerFullName();

        System.out.println("Current ram : " + computer.getRam());
        computer.addRam(2);
        System.out.println("New ram : " + computer.getRam());

        computer.addRam(32);



        System.out.println();
        System.out.println("Bubble sort demonstration");

        BubbleSortDemo bubbleSortDemo = new BubbleSortDemo();

        int[] array = {1, 88, 0, -25, 8888, 1414, 122, 0, 0, 0, 223, 3, -1547};
        bubbleSortDemo.sort(array);

        bubbleSortDemo.printArray(array);
    }
}
