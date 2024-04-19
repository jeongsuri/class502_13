package exam03;

import exam01.A;

public class Ex03 {
    public static void main(String[] args) {
        Human human = new Human();
        human.move();

        Animal ac = new Human();
        ac.move();

        Human human1 = (Human) ac;
        human1.move();



        Bird bird = new Bird();
        bird.move();

        Animal animal = new Animal();
        animal.move();
    }
}
