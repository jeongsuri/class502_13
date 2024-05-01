package Quest03;


public class Main {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CongCaffee congcaffee = new CongCaffee();

        Person kim = new Person("김씨", 4000);
        Person lee = new Person("이씨", 4500);


        kim.buyStarBuucks(starBucks,kim.getMoney());
        lee.butCongCaffee(congcaffee,lee.getMoney());
    }

}
