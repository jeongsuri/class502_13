package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\bjava\\B");
        String str = "java like java and javasrcipt";
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
