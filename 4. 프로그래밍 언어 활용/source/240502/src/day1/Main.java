package day1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Counter.c); // > 10출력
        //System.out.println(Counter.a); //오류
        Counter sub = new Counter();
        System.out.println(sub.a);
    }
}
