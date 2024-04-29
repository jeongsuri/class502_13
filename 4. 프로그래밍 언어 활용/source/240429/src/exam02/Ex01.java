package exam02;

import exam01.Fruit;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Jucier.make(appleBox);
    }
}
