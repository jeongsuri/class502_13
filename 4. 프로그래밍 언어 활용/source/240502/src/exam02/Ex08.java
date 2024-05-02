package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex08 {
    public static void main(String[] args) {
        int[] nums = {22, 11, 10, 2, 6, 8, 33};
        //Arrays.stream(nums).map(x -> x * x).filter(x -> x % 2 == 1).forEach(System.out :: println);
        //forEach를 작성하야 최종연산이 가능하게된다.

        IntStream stm1 = Arrays.stream(nums);
        IntStream stm2 = stm1.map(x -> x * x ).filter( x -> x % 2 ==1);
    }
}
