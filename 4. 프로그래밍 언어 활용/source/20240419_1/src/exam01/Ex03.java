package exam01;

public class Ex03 {
    public static void main(String[] args) {
        /*
        C c = new C();
        System.out.println(System.identityHashCode(c));
        B b = new B();
        A a = c; //객체가 복사되는것이아니라 c의주소값을넣음
        System.out.println(System.identityHashCode(a));
        A ab = b; //객체가 복사되는것이아니라 c의주소값을넣음
        // B b = c;
        System.out.println(System.identityHashCode(ab));

         */

        /*
        (업 캐스팅)
        C c = new C();
        A a = c;
        --------------위아래같음-------------
        A a = new c();
         */

        //A ad = new D();
        //업캐스팅
        A ac = new C();
        A ad = new D();
        //ac.numA
        System.out.println(ac.numA);
        //다운캐스팅
        if(ac instanceof  C){ //true
            C c = (C) ac;
            System.out.println(((C) ac).numB);
        }
        if(ad instanceof C){ //false 절대불가능
            C c = (C) ad;
        }
    }
}
