package exam01;

import java.time.Instant;

public class Ex01 {
    public static void main(String[] args) {
        Instant today = Instant.now();
        System.out.println(today);

        long time1 = today.getEpochSecond(); // 초단위
        long time2 = today.toEpochMilli(); //밀리초 단위 - EpochTime, 중복이 없기 때문에 UID만들때 활용됨.
        System.out.println(time1);
        System.out.println(time2);
    }
}
