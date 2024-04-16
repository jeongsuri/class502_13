package exam03;

import exam02.*;

public class Ex01 {
    public static void main(String[] args) {
        //exam02.A a = new exam02.A(); //
        // 다른 패키지 : 클래스이름앞에 패키지를 써야한다
        // 같은 패키지 : 생략가능
        A a = new A(); //다른패키지이지만, import 사용하면 생략가능
        B b = new B();
        a.numA=5;
        //a.numAA=5; 오류
        }
}
