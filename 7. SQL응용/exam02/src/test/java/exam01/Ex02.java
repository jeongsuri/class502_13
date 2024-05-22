package exam01;

import member.Board;
import member.Member;
import member.User;
import member.User2;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class Ex02 {
    @Test
    void test1(){
        Member member = new Member();
    }
    @Test
    void test2(){
        Board board = new Board("제목", "내용");
        System.out.println(board);
    }

    @Test
    void test3(){
        User user = User.builder()
                .userId("USER01")
                .userNm("사용자01")
                .email("User@naver.com")
                .regDt(LocalDateTime.now())
                .build();

        System.out.println(user);
    }

    @Test
    void test4(){
        User2 user = User2.builder()
                .userId("User02")
                .userNm("사용자01")
                .email("user2@naver.com")
                .regDt(LocalDateTime.now())
                .build();
        System.out.println(user);
    }


}
