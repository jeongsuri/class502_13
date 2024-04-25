package exam02;

import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자만 입력 :  ");
        String str = sc.nextLine();

        Pattern p1 = Pattern.compile("[\\d]");
        Pattern p2 = Pattern.compile("[\\D]");
        Matcher m1 = p1.matcher(str);
        Matcher m2 = p2.matcher(str);
        if(!m1.find()){
            System.out.println("숫자가 포함되어있지않습니다.");
        }
        if(m2.find()){
            System.out.println("숫자만 입력해");
        }
    }
}
