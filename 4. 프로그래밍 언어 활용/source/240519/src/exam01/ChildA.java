package exam01;

public class ChildA extends Parents {
    public void both(){
        System.out.println(this + " A자식입니다.");
    }
    public void onlyChild(){
        System.out.println(this + " A자식입니다.");
    }
}

