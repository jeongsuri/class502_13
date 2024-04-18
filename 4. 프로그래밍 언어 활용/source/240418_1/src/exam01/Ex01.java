package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        Board board1 = Board.getInstance();
        Board board2 = Board.getInstance();

        System.out.println(board1==board2);
        System.out.println("b1 주소 : " + System.identityHashCode(board1));
        System.out.println("b1 주소 : " + System.identityHashCode(board2));

    }

}
