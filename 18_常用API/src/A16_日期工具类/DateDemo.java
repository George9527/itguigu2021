package A16_日期工具类;

import java.text.ParseException;
import java.util.Date;

/*
    测试类
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {

        //dateToString
        //创建日期对象
        Date d1 = new Date();

        String s1 = DateUtils.dateToString(d1, "yyyy年mm月dd日 HH时MM分ss秒");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d1, "yyyy年mm月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d1, "HH时MM分ss秒");
        System.out.println(s3);
        System.out.println("----------");

        //stringToDate
        //创建日期字符串
        String s4 = "2011-11-11 11:11:11";

        Date d2 = DateUtils.stringToDate(s4, "yyyy-MM-dd HH:mm:ss");
        System.out.println(d2);
    }
}

