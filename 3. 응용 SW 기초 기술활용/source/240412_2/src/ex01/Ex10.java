package ex01;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 1000000;
//        byte num2 = num1; >오류(데이터의 유실이 발생할 가능성이 있는 경우)
        byte num2 = (byte)num1; //명시적 형변환(강제 형변환)
        System.out.println(num2);
    }
}
