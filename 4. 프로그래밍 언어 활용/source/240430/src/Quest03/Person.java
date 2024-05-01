package Quest03;


public class Person {
    private String name;
    private int money;
    //private String menu;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        //this.menu = menu;
    }

    public int getMoney() {
        return money;
    }


    public void buyStarBuucks(StarBucks starbucks, int money) {
        String message = starbucks.order(money);
        System.out.println(name+"은 "+message);
    }
    public void butCongCaffee(CongCaffee congcaffee,int money) {
        String message = congcaffee.order(money);
        System.out.println(name+"은 "+message);
    }
}


