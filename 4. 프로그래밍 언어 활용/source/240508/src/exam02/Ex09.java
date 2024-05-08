package exam02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex09 {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime londonZdt = zdt1.withZoneSameInstant(london);
        System.out.println(londonZdt);


        //ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
