package am.picsart.lessons.lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Lesson5 lesson5 = new Lesson5();
        int n = lesson5.fib(3);
        System.out.println(n);
    }

    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

}
