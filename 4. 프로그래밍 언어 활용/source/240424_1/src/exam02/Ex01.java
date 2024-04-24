package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        //서로 다른 객체 2개가 생성된다.
        System.out.printf("s1==s1 : %s%n",s1==s2);
        System.out.printf("s1의주소 : %s%n", System.identityHashCode(s1));
        System.out.printf("s2의주소 : %s%n", System.identityHashCode(s2));
    }
}
