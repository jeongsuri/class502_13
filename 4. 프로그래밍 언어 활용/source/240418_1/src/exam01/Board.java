package exam01;

public class Board {
    private Board(){}
    private static Board instance;

    public static Board getInstance() {
        if(instance==null){
            instance = new Board();
        }
        return instance;
    }
}
