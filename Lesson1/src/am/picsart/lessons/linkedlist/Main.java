package am.picsart.lessons.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList names = new LinkedList();

        names.add("Artur");
        names.add("Artak");
        names.add("Gagik");
        names.add("Vardan");
        names.add("Ara");
        System.out.println(names);

        System.out.println();
        System.out.println("Poll - " + names.poll());
        System.out.println(names);
        System.out.println("Peek - " + names.peek());

        System.out.println();
        System.out.println("Set element with index 2 to Gago");
        names.set(2,"Gago");
        System.out.println(names);

        System.out.println();
        System.out.println("Add Ashot element with index 1");
        names.add(1,"Ashot");
        System.out.println(names);

        System.out.println();
        System.out.println("Delete Gago from list");
        names.remove("Gago");
        System.out.println(names);

        System.out.println();
        System.out.println("Delete second element");
        names.remove(1);
        System.out.println(names);

        System.out.println();
        System.out.println("Get element with index 1");
        System.out.println(names.get(1) + " index is 1");

        System.out.println();
        System.out.println("Iterate objects");
        for (Object object : names){
            System.out.println(object);
        }

    }


}
