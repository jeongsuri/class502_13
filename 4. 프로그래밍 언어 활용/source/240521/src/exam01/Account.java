package exam01;

public class Account {
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    public  void wirhdraw(int money){
        synchronized(this) {
            if (balance >= money) {
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                }

                balance -= money;
            }
        }
    }
}
