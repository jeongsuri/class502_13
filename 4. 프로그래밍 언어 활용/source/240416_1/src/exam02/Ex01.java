package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        s1.year = 2014;
        s1.month = 2;
        s1.day = 31; //직접대입을 지양해라 why? 통제가 불가능하기떄문에

        s1.showDate();
    }
}
