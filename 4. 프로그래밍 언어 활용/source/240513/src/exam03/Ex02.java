package exam03;


public class Ex02 {
    public static void main(String[] args) {
        Calculator cal1 = new Decorate(new ImplCalculator());
        long result1 = cal1.factorial(10L);
        System.out.println(result1);

        Calculator cal2 = new Decorate(new RecCalculator());
        long result2 = cal1.factorial(10L);
        System.out.println(result2);

    }
}
