package exam01;

//T는 Fruit의 하위클래스로 한정.
public class Box<T extends Fruit & Eatable> { // Box<T> : 제네릭 클래스, T 타입 매개변수, Box : 원시타입
    private T item;

    //private  static  T item2;
    //사용 불가, 처음부터 공간을 할당 받으므로 자료형이 명확해야한다.

    //private static T[] nums = new T[3];
    //사용불가, 배열에서 공간 생성을 위해서는 자료형이 명확해야한다.

    public void setItem(T item){
        this.item = item;

    }
    public T getItem() {
        return item;
    }

    public String toString(){
        // T == Fruit Fruit를 상속받았으니 Object가 아니라 Fruit
        return item.get();
    }
}
