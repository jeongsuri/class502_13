package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Calculator cal = outer.method(30);
        System.out.println("메인"+cal);
        int result = cal.add(10,20);
        System.out.println(result);

        Calculator cal1 = outer.method1(30);
        int result1  = cal1.add(10,20);
        System.out.println(result1);

    }
}
