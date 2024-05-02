package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름3","이름2","이름1","이름4");
        Collections.sort(names); // 기본 정렬 기준 (natural Order - java.lang.Comparable int compareTo(...)
        System.out.println(names);
    }
}
