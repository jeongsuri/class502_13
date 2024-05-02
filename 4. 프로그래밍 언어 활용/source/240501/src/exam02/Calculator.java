package exam02;

@FunctionalInterface
public interface Calculator {
    int add(int num1, int num2);
    //int minus(int num1, int num2);
    //함수형 프로그래밍을 하는 람다는 단일기능만 가능하다.그래서 오류
    //인터페이스상에서는 문제가 없지만. 메인함수에서 사용하게되면 어느 추상메서드를 가르키는지 잘알지 못한다.

}
