package exam03;

public class Board {
    private static Board instance = new Board();

    public static Board getInstance() {
        return instance;
    }

    public void setInstance(Board instance) {
        this.instance = instance;
    }

    private Board(){}
}
