package exam04;

public interface Buyer {
    void buy();

    default void order(){ //디폴트 메서드
        System.out.println("바이어에서 주문");
    }
}
