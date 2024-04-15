package exam01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        String[] strs = {"가나","다라","마바"};
        int[][] nums = {{1, 2, 3} , {4, 5, 6}};
        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.deepToString(nums));
    }
}
