package exam03;

public class Box<T> {
    private T item;

    public void method1(T str1, T str2) { //제네릭 클래스, Box가 객체가 될 때 T의 자료형 결정.
    }

    public <T> void method2(T str1, T str2) { // 제네릭 매서드, 메서드 호출시 T의 자료형 결정
    }
}
