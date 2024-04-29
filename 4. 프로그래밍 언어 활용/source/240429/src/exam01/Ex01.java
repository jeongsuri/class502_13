package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.setItem(new Apple());
        //appleBox.setItem(new Grape()); //타입안전성 확보
        Apple apple = appleBox.getItem(); //형변환X
        System.out.println(apple.get());
    }
}
