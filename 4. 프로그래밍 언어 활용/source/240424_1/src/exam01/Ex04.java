package exam01;

public class Ex04 {
    public static void main(String[] args) {
        String str1 = new String("ABC"); //ABC값을 가지고잇는 객체1
        String str2 = new String("ABC"); //ABC값을 가지고잇는 객체1
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
