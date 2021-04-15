package A06_DateFormat日期格式化;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    3.4.1 DateFormat日期格式化
      java.text.DateFormat :
      类的作用是格式化日期的,但是抽象类不能建立对象,
      需要创建子类的对象, SimpleDateFormat
 */
public class DateFormat {
    public static void main(String[] args) {
        /**
         * 日期格式化,自定义格式
         */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        String str = sdf.format(new Date());
        System.out.println(str);

        // 小结： 需要导包
        // import java.util.Date;
        // 类的作用是格式化日期的,但是抽象类不能建立对象,
    }
}
