package different;
import same.A;

public class B extends A {
    void print(){
        protectedNum = 100;
        System.out.println(protectedNum);
    }
}
