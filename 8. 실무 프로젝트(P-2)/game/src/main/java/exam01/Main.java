package exam01;

import configs.DBConn;
import game.Game;
import game.Register;
import member.Member;
import org.apache.ibatis.session.SqlSession;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        String userId = null;
        System.out.print("닉네임을 입력하세요 : ");
        try{
            userId = sc.next();
        }catch(Exception e){
            e.printStackTrace();
        }
        Register register = new Register(userId);
        register.register();
        System.out.println("성공적으로 로그인했습니다.");
        System.out.printf("%s님 반갑습니다.%n",userId);
        while(true){
            System.out.println("1.묵찌빠 2.랭킹확인 3.종료");
            System.out.print("수행하고자 하는 숫자 입력하세요 : ");
            switch (sc.nextInt()){
                case 1:
                    game.gameStrat();
                case 2:
                    System.out.println("랭킹확인");
                case 3:
                    System.out.println("종료");
            }

        }


    }
}
