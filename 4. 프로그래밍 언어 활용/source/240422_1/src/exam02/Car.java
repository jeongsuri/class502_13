package exam02;

public abstract class Car {
    public abstract void start();
    public abstract void press();
    public abstract void trunoff();

    public final void run(){ //템플릿 메서드 (절차를 정의하는 메서드_
        start();
        press();
        trunoff();
    }
}
