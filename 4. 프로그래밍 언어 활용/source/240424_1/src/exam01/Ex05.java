package exam01;

import java.util.HashSet;

public class Ex05 {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("AAA");
        data.add("ggg");
        data.add("AAA");
        data.add("ccc");
        System.out.println(data);
    }
}
