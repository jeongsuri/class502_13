package exam02;

import java.nio.DoubleBuffer;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        System.out.printf("s1==s1 : %s%n",s1==s2);
        System.out.printf("s1의주소 : %s%n", System.identityHashCode(s1));
        System.out.printf("s2의주소 : %s%n", System.identityHashCode(s2));


    }
}
