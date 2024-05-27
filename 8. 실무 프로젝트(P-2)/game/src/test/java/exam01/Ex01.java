package exam01;

import configs.DBConn;
import game.Score;
import mappers.MemberMapper;
import mappers.ScoreMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Ex01 {
    private SqlSession session = DBConn.getSession();
    @Test
    public void test1(){ //전체 회원조회
        List<Member> members = session.selectList("mappers.MemberMapper.getList");
        members.forEach(System.out::println);
    }


    @Test
    public void test2(){ //가입
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        Member member = Member.builder()
                .userId("test153")
                .build();
        int cnt = mapper.register(member);
        System.out.println(cnt);
    }

    @Test
    public void test3(){ //회원 유무조회 후 가입
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        Member member = Member.builder()
                .userId("test10")
                .build();
        List<Member> members = mapper.getList2(member);
        if(members.isEmpty() == true){
            mapper.register(member);
            System.out.println("가입완료");

        }else{
            System.out.println("존재합니다.");
        }
    }

    @Test
    public void test4(){ //전체 랭킹조회
        List<Score> scores = session.selectList("mappers.ScoreMapper.allScore");
        scores.forEach(System.out::println);
    }

    @Test
    public void test5(){ //내 랭킹조회
        ScoreMapper mapper = session.getMapper(ScoreMapper.class);
        Score score = Score.builder()
                .userId("test3")
                .build();
        List<Score> scores = mapper.myScore(score);
        scores.forEach(System.out::println);
    }

    @Test
    public void test6(){ //점수 저장
        ScoreMapper mapper = session.getMapper(ScoreMapper.class);
        Score score = Score.builder()
                .score(10)
                .userId("test10")
                .build();
        int cnt = mapper.insertScore(score);
    }

    @Test
    public  void test7(){
        String rock = "✊";
        String scissor = "✌️";
        String paper = "✋";

        ArrayList<String> p1 = new ArrayList<>();
        p1.add("✌️");
        System.out.println(p1.get(0));


    }

}
