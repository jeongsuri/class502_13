package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Box<Grape> grapeBox = new Box<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        Jucier.make(grapeBox);

    }
}
