package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        /*
        s1.year = 2014;
        s1.month = 2;
        s1.day = 31; //직접대입을 지양해라 why? 통제가 불가능하기떄문에

         */
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        int year = s1.getYear();
        int month = s1.getMonth();
        int day = s1.getDay();
        System.out.printf("%d %d %d\n",year,month,day);

        s1.showDate();
    }
}
