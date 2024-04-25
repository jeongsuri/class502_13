package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {
        String str = "I like java and javascript";

        Pattern p1 = Pattern.compile("java"); //생성자가 없음 (new())
        Pattern p2 = Pattern.compile(".*java.*"); //생성자가 없음 (new())
        Matcher m1 = p1.matcher(str); //패턴 일치 여부 체크
        Matcher m2 = p2.matcher(str); //패턴 일치 여부 체크
        boolean match1 = m1.matches();
        boolean match2 = m2.matches();
        System.out.println(match1);
        System.out.println(match2);

    }
}
