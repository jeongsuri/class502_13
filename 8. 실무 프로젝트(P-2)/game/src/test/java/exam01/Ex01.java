package exam01;

import configs.DBConn;
import game.Score;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

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
                .userId("test156")
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
        List<Score> scores = session.selectList("mappers.ScoreMapper.getList");
        scores.forEach(System.out::println);
    }

}
