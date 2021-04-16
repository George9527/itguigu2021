package A15_SimpleDateFormat;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
    构造方法：
        public SimpleDateFormat​():构造一个SimpleDateFormat，使用默认模式和日期格式
        public SimpleDateFormat​(String pattern):构造一个SimpleDateFormat使用给定的模式和默认的日期格式

    格式化：从 Date 到 String
        public final String format(Date date)：将日期格式化成日期/时间字符串

    解析：从 String 到 Date
        public Date parse​(String source)：从给定字符串的开始解析文本以生成日期
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化：从 Date 到 String
        Date d = new Date();
        //使用无参构造方法
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);

        //自定义日期格式
        Date d2 = new Date();
        SimpleDateFormat test = new SimpleDateFormat("yyyy年mm月dd日  HH：mm：ss");
        String s1 = test.format(d2);
        System.out.println(s1);

        System.out.println("----------");

        //解析：从 String 到 Date
        //String s2 = "2011-11-11 11:11:11";
        //ParseException --- 报错 字符串格式 S2 和 test2 格式不一样 不能匹配上
        String s2 = "2011年11月11日  11:11:11";
        SimpleDateFormat test2 = new SimpleDateFormat("yyyy年mm月dd日  HH:mm:ss");
        Date d3 = test2.parse(s2);
        System.out.println(d3);
    }
}
