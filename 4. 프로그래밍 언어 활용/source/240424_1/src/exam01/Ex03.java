package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Book b1 = new Book(1000,"책1", "저자1");
        Book b2 = new Book(1000,"책1", "저자1");
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(System.identityHashCode(b1));
        System.out.println(System.identityHashCode(b2));
    }
}