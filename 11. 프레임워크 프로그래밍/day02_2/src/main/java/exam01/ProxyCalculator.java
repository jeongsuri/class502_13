package exam01;

public class ProxyCalculator implements Calculator{
    //ImplCalculator, RecCalculator 대신 수형 주려면? 자료형? 다형성

    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;

    }
    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); //공통기능
        //다른 계산기의 핵심 기능을 대신 수행
        try {
            long result = calculator.factorial(num); //다른 계신기의 factorial 연산을 대신 수행
            return result;
        }finally {
            long etime = System.nanoTime(); //공통기능
            System.out.println(etime-stime);
        }
    }
}
