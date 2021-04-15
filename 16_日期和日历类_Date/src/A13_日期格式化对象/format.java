package A13_日期格式化对象;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 方法format格式化
 *
 */
public class format {
    public static void main(String[] args) {

        //静态方法,传递日期格式,返回本类的对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //dateTimeFormatter对象调用方法format
        String format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(format);
    }
}
