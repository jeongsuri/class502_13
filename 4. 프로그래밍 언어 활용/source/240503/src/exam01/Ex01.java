package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] fruits = {"apple","orange","apple" ,"banana","melon","mango"};

        /*
        중복제거
        문자열 길이 변경(String -> int : maptoInt : String -> int
        int[] 배열로 변경
         */

        Arrays.stream(fruits).distinct().mapToInt(String::length);
    }
}
