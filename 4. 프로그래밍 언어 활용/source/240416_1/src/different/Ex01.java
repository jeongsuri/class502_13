package different;

import same.A;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        a.publicNum=10;
        //a.protectedNum=10;
        //a.defaultNum=10;
        //a.privateNum=10;오류
    }
}
