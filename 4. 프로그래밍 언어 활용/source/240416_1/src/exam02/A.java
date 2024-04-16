package exam02;

public class A { //exam02.A
    public int numA;
    int numAA; // default 접근 제어자, 동일패키지만 접근가능.
    private int NumAAA;
    protected int numB;

    void printNum(){
        NumAAA = 100;
        System.out.println(NumAAA);
    }
}
