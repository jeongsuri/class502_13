package exam02;

public class Main {
    public static void main(String[] args) {
        A ad = new D();
        A ac = new C();

        C c = (C)ad;
        C c1 = (C)ac;

        System.out.println(c.numc);
        System.out.println(c1.numA);


    }
}
