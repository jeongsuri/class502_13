package exam01;

import javax.print.attribute.standard.SheetCollate;

public class Ex02 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(2024,3,17);
        s1.showDate();

        Schedule s2 = new Schedule();
        s2.showDate();
    }
}
