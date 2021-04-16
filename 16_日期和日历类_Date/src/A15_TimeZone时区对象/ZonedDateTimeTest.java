package A15_TimeZone时区对象;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

    public static void main(String[] args) {
        //JDK8时区
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        ZonedDateTime now1 = ZonedDateTime.now(ZoneId.of("America/New_York"));//设置时区
        System.out.println(now1);

    }

}
