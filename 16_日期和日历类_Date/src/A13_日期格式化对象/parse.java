package A13_日期格式化对象;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/*

  DateTimeFormatter

  JDK8中的日期格式化对象 : java.time.format包
    - static DateTimeFormatter ofPattern(String str)自定义的格式
    - String format(TemporalAccessor t)日期或者时间的格式化
    - TemporalAccessor  parse(String s)字符串解析为日期对象

 */
public class parse {
    public static void main(String[] args) {

        /**
         * 方法parse,字符串转日期
         */

        //静态方法,传递日期格式,返回本类的对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = "2021-04-13 15:55:55";

        //dateTimeFormatter调用方法parse转换
        //返回接口类型,接口是LocalDate,LocalDateTime 都实现了该接口
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse(str);

        //System.out.println(temporalAccessor);
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime);
    }
}
