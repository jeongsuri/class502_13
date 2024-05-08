package exam01;

import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);
        //cal.set(Calendar.MONTH,11);
        cal.add(Calendar.DAY_OF_MONTH, 150);
        printDate(cal);
        cal.add(Calendar.DAY_OF_MONTH, -100);
        printDate(cal);
    }

    public static void printDate(Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        System.out.println(year + " " + month + " " + day);
    }
}
