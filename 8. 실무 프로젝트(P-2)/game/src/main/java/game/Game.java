package game;

import java.util.ArrayList;
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
        int me;
        int you;

        ArrayList<String> p1 = new ArrayList<>();
        p1.add("✌️");
        p1.add("✊");
        p1.add("✋");

        while (true) {
            System.out.print("가위바위보 : ");
            me = sc.nextInt()-1;
            you = random.nextInt(3) + 1;
            if (me != you) {
                if (me + you * 2 == 1 || me + you * 2 == 4) {
                    System.out.println("|  🧑‍💻  |  🖥  |" );
                    System.out.println("|  " + p1.get(me-1) + "  |  " + p1.get(you) +  "  |");
                    System.out.println("공격차례입니다.");
                    System.out.print("가위바위보 : ");
                    me = sc.nextInt() -1 ;
                    you = random.nextInt(2) +1;
                    if (me == you) {
                        score++;
                        System.out.println("|  🧑‍💻  |  🖥  |" );
                        System.out.println("|  " + p1.get(me) + "  |  " + p1.get(you) +  "  |");
                        System.out.printf("이겼습니다. %d%n점", score);
                    }
                } else {
                    System.out.println("|  🧑‍💻  |  🖥  |" );
                    System.out.println("|  " + p1.get(me) + "  |  " + p1.get(you) +  "  |");
                    System.out.println("졌습니다. 수비차례입니다.");
                    System.out.print("가위바위보 : ");
                    me = sc.nextInt() - 1;
                    you = random.nextInt(2) + 1;
                    if (me == you) {
                        score--;
                        System.out.println("|  🧑‍💻  |  🖥  |" );
                        System.out.println("|  " + p1.get(me) + "  |  " + p1.get(you) +  "  |");
                        System.out.printf("졌습니다. 최종점수 : %d%n점", score);
                        break;
                    }
                    else{
                        System.out.println("|  🧑‍💻  |  🖥  |" );
                        System.out.println("|  " + p1.get(me) + "  |  " + p1.get(you) +  "  |");
                    }
                }
            } else {
                System.out.println("|  🧑‍💻  |  🖥  | : " );
                System.out.println("|  " + p1.get(me) + "  |  " + p1.get(you) +  "  |");
                System.out.println("비겼습니다.");
            }
        }
        return score;
    }



}
