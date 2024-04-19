package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = {new Human(), new Bird(), new Tiger()};
        for(Animal animal : animals){
            animal.move();
            if(animal instanceof  Human){
                Human human = (Human)animal;//다운캐스팅
                human.reading();
            }else if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;//다운캐스팅
                tiger.hunting();
            }
            //human.reading(); //animal이 human bird tiger을 다가지고있어서 오류

        }

    }
}
