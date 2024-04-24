package exam02;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100); //매개변수가없으면 기본값 16byte로 설정
        sb.append("ABC");
        System.out.println(System.identityHashCode(sb));
        sb.append("DEF");
        System.out.println(System.identityHashCode(sb));
        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString();
        System.out.println(System.identityHashCode(str));
        System.out.println(str);
    }
}
