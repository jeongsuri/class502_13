package exam03;

import exam01.A;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human();  //자료형을 Human, Animal가능
        //human.move();

        Tiger tiger = new Tiger(); //자료형을 Tiger, Animal가능
        //tiger.move();

        Bird bird = new Bird(); //자료형을 Bird, Animal가능
        //bird.move();


        Animal[] animals = new Animal[3];
        animals[0] = human;
        animals[1] = tiger;
        animals[2] = bird;




        for(int i=0; i< animals.length; i++){
            animals[i].move();
        }
    }
}
