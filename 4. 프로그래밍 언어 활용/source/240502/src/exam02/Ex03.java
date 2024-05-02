package exam02;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "mango", "melon"};
        Arrays.stream(fruits).map(s -> "*" + s + "*").map(String::toUpperCase).forEach(System.out :: println);

    }
}
