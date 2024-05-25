package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String userid;
    private int game;
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public void Game() {
        //this.userid = userid;
    }

    public int gameStrat() {
        System.out.println("묵찌빠게임시작");
        int score = 0;
        int me = 0;
        int you;

        System.out.print("가위바위보 : ");
        me = sc.nextInt();
        you = random.nextInt(2) + 1;

        while (true) {
            if (me != you) {
                if (2 * me + you == 5 || 2 * me + you == 8) {
                    System.out.println("내가낸거 : " + me);
                    System.out.println("상대가 낸거 : " + you);
                    System.out.println("공격차례입니다.");
                    System.out.print("가위바위보 : ");
                    me = sc.nextInt();
                    you = random.nextInt(2) + 1;
                    if (me == you) {
                        score++;
                        System.out.println("내가낸거 : " + me);
                        System.out.println("상대가 낸거 : " + you);
                        System.out.printf("이겼습니다. %d%n점", score);
                    }
                } else {
                    System.out.println("내가낸거 : " + me);
                    System.out.println("상대가 낸거 : " + you);
                    System.out.println("졌습니다. 수비차례입니다.");
                    System.out.print("가위바위보 : ");
                    me = sc.nextInt();
                    you = random.nextInt(2) + 1;
                    if (me == you) {
                        score--;
                        System.out.println("내가낸거 : " + me);
                        System.out.println("상대가 낸거 : " + you);
                        System.out.printf("졌습니다. %d%n점", score);
                        break;
                    }
                }
            } else {
                System.out.println("내가낸거 : " + me);
                System.out.println("상대가 낸거 : " + you);
                System.out.println("비겼습니다.");
                System.out.print("가위바위보 : ");
                me = sc.nextInt();
                you = random.nextInt(2) + 1;
            }
        }
        System.out.println(score);
        return score;
    }

}
