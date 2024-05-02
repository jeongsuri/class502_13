package exam01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
        List<String> chars = Arrays.asList("AA","BB","CC","AA","CC","AA");
        int cnt = Collections.frequency(chars,"AA");
        System.out.println(cnt);
    }
}
