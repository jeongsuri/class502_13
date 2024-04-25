package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        String str = "AAA\n1234\nBBBBBBB\n4567\nCCC";
        //4글자로 구성된 단어
        Pattern p1 = Pattern.compile("\\b.{4,}\\b");
        Matcher m1 = p1.matcher(str);
        if(m1.find()){
            System.out.println(m1.group());
        }
        if(m1.find()){
            System.out.println(m1.group());
        }
        if(m1.find()){
            System.out.println(m1.group());
        }
    }
}
