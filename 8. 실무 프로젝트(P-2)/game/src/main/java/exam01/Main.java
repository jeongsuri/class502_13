package exam01;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member member = new Member();

        System.out.print("닉네임을 입력하세요 : ");
        try{
            member.setUserId(sc.next());
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("성공적으로 로그인했습니다.");
        System.out.printf("%s님 반갑습니다.%n",member.getUserId());
        System.out.println("1.묵찌빠 2.랭킹확인 3.종료");
        System.out.print("수행하고자 하는 숫자 입력하세요 : ");
        switch (sc.nextInt()){
            case 1:
                System.out.println("묵찌빠");
            case 2:
                System.out.println("랭킹확인");
            case 3:
                System.out.println("종료");
        }






    }
}
