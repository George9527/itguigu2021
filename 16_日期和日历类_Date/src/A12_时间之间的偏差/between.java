package A12_时间之间的偏差;

import java.time.Duration;
import java.time.LocalDateTime;

/*
    Duration计算时间之间的偏差
        - static Period between(Temporal d1,Temporal d2)计算两个日期之间的差值.
 */
public class between {
    public static void main(String[] args) {

        // 获取当前时间
        LocalDateTime d1 = LocalDateTime.now();

        // 利用 of方法 重新设置 年、月、日、 时、分、秒
        LocalDateTime d2 = LocalDateTime.of(2021,5,13,15,32,20);

        // Duration静态方法进行计算对比
        Duration duration = Duration.between(d1, d2);

        // Duration类的对象,获取计算的结果
        long minutes = duration.toMinutes();
        System.out.println("相差分钟:" + minutes);

        long days = duration.toDays();
        System.out.println("相差天数:"+days);

        long millis = duration.toMillis();
        System.out.println("相差秒:" + millis);

        long hours = duration.toHours();
        System.out.println("相差小时:"+hours);
    }
}
