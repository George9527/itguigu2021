package A15_TimeZone时区对象;

import java.util.Date;
import java.util.TimeZone;

/**
 *   TimeZone 时区对象
 */

public class TimeZoneTest {
    public static void main(String[] args) {
        //TimeZone静态方法 .getDefault()  默认的时区
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("timeZone = " + timeZone);

        /*String[] strings =  TimeZone.getAvailableIDs(); //获取全球时区
        for(int x = 0 ; x < strings.length; x++){
            System.out.println(strings[x]);
        }*/

        //设置时区
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        System.out.println(new Date());
    }
}
