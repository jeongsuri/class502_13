package exam02;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jucier {
    // 상한제한 ? : Fruit, Apple, Grape
    public static void make(Box<? extends Fruit> box){
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
        
    }
    //제네릭 메서드, extends만 사용 가능.
    public static <T extends Fruit> void make3(Box<T> box){

    }
    // 하한제한 ? : Apple,Fruit,Object
    public static void make2(Box<? super Apple> box){
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }
}
