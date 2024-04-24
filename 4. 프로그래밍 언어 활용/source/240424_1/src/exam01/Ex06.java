package exam01;

import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book(1000,"책1","저자1"));
        books.add(new Book(1000,"책1","저자1"));
        books.add(new Book(1000,"책2","저자1"));
        books.add(new Book(1000,"책3","저자1"));
        books.add(new Book(1000,"책4","저자1"));
        books.add(new Book(1000,"책5","저자1"));
        for(Book book: books){
            System.out.println(book);
            System.out.printf("str1.hashCode : %s%n",book.hashCode());
        }
    }
}
