package exam04;

public interface Seller {
    void sell();
    default void order(){
        System.out.println("셀러에서 주문");
    }

    public static void staticMothod(){
        System.out.println("정적메서드");
    }
}
