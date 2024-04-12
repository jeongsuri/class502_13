package ex01;

public class Ex11 {
    public static void main(String[] args) {
        double num1 = 10.123;
        //long num2 = num1; //오류 실수->정수
        long num2 = (long)num1; //명시적 형변환
        System.out.println(num2); // 소수점 아래숫자는 없어지고 정수만 출력
    }
}
