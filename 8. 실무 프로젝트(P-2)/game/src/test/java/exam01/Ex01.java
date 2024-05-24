package exam01;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

    @Test
    public void Login(){
        System.out.println("닉네임을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        Member member = new Member();
        try {
            member.setUserId(sc.next());
        }catch(NoSuchElementException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void game1(){
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
    }

}
