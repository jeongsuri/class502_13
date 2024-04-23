package exam01;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A(){
            public void method(){
                System.out.println("오버라이딩");
            }
        };
        a.method();
    }
}
