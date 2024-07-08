package exam01;

import org.junit.jupiter.api.Test;

public class Ex01 {

    @Test
    void test1(){
        ImplCalculator cal1 = new ImplCalculator();
        long stime = System.nanoTime(); // 공통기능
        long result1 = cal1.factorial(10L); //핵심기능
        long etime = System.nanoTime(); // 공통기능
        System.out.println(result1);
        System.out.println(etime - stime);

        RecCalculator cal2 = new RecCalculator();
        stime = System.nanoTime(); // 공통기능
        long result2 = cal2.factorial(10L); //핵심기능
        etime = System.nanoTime(); // 공통기능
        System.out.println(result2);
        System.out.println(etime - stime);
    }

    @Test
    void test2(){
    Calculator cal1 = new ProxyCalculator(new ImplCalculator());
    long result1 = cal1.factorial(10L);
    System.out.println(result1);

    Calculator cal2 = new ProxyCalculator(new RecCalculator());
    long result2 = cal2.factorial(10L);
    System.out.println(result2);
    }
}
