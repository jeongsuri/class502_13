package exam03;

public class Decorate implements Calculator {

    private Calculator calculator;
    public Decorate(Calculator calculator){
        this.calculator = calculator;
    }

    public long factorial(long num){

        long stime = System.nanoTime(); // 공통 추가 기능
        try {
            long result = calculator.factorial(num); // 핵심 기능을 대신 수행

            return  result;
        }finally {
            long etime = System.nanoTime(); // 공통 추가 기능
            System.out.println(etime - stime);
        }
    }
}
