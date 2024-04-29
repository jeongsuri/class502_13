package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        Jucier.make2(appleBox); //Apple, Fruit, Object
        //Box<Grape> grapeBox = new Box<>();
        Box<Fruit> grapeBox = new Box<>(); //Fruit fruit = new Grape(); 업캐스팅
        grapeBox.add(new Grape());
        Jucier.make2(grapeBox);
    }
}
