package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.buy();
        order.sell();

        Buyer buyer = order; //업캐스팅
        //buyer.buy();

        Seller seller = order;
        seller.sell();
    }
}
