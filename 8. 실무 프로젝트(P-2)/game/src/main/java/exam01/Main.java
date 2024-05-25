package exam01;

import configs.DBConn;
import game.Game;
import game.Register;
import game.Score;
import mappers.ScoreMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SqlSession session = DBConn.getSession();
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

                    System.out.println("전체랭킹");
                    List<Score> scores1 = session.selectList("mappers.ScoreMapper.allScore");
                    scores1.forEach(System.out::println);

                    System.out.println("본인랭킹");
                    ScoreMapper mapper = session.getMapper(ScoreMapper.class);
                    Score score = Score.builder()
                            .userId(userId)
                            .build();
                    List<Score> scores2 = mapper.myScore(score);
                    scores2.forEach(System.out::println);
                case 3:
                    System.out.println("종료");
            }

        }


    }
}
