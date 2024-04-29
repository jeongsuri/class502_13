package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());

        Jucier.make2(appleBox);
    }
}
