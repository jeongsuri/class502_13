package exam03;

public class Ex01 {
    public static void main(String[] args) {
        //공통 추가기능
        long stime = System.nanoTime();

        //핵심기능
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10L);
        System.out.println(result1);

        //공통 추가기능
        long etime = System.nanoTime();
        System.out.println(etime-stime);

        //공통 추가기능
        stime = System.nanoTime();

        //핵심기능
        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10L);
        System.out.println(result2);

        //공통 추가기능
        etime = System.nanoTime();
        System.out.println(etime-stime);
    }
}
