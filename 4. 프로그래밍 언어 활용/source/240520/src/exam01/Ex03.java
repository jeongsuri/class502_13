package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread th1 = new Thread(() -> System.out.println("실행부분"));
    }
}
