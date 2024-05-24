package exam01;

import java.util.Random;

public class Game1 {
    private String userid;
    private int game;

    public void Game1(Member userid){
        this.userid = userid.toString();
    }

    public int gameStrat(){
        int score = 0;
        int me = 0;
        int you;
        //가위 바위 보
        //      1   2   3
        //이기는거3   1   2
        //지는거 2   3   1
        //435,354

        Random random = new Random();
        //Scanner sc = new Scanner(System.in);
        System.out.println("묵찌빠게임 시작");
        System.out.print("가위바위보 : ");
        //me = sc.nextInt();
        you = random.nextInt(2);

        return score;
    }


}
