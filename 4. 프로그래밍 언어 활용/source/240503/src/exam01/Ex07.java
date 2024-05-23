package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과","배","오렌지","망고");

        String[] selected = fruits.stream().skip(2).limit(2).toArray(String[] :: new);

        System.out.println(Arrays.toString(selected));
    }
}
