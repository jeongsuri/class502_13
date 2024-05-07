package exam01;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int firstOdd = rand.ints(100).filter(x -> x % 2 == 1).findFirst().orElse(-1);
        //findFirst의 반환값이 OptionalInt이기 때문에 값이 없을 가능성이 있다.
        //그렇기 때문에 orElse로 반환겂이 없을 때의 기본값을 설정한다.
        System.out.println(firstOdd);
    }
}
