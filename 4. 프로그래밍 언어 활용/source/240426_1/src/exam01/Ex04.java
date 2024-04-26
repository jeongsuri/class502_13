package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        String str = trans.name(); //trans.toString()
        System.out.println(str); //> BUS

        int ordianl = trans.ordinal();
        System.out.println(ordianl); //> 0번째 출력


    }
}
