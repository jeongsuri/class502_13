package exam02;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        String str = sb.append("ABC").append("DEF").append("GHI").toString(); //메서드체인
        System.out.println(str);
        /*
        StringBuffer sb2 = sb.append("ABC"); //반환값은 this로 StringBuffer그자체이다.
        StringBuffer sb3 = sb2.append("DEF");
        System.out.println(sb==sb2);
         */

    }
}
