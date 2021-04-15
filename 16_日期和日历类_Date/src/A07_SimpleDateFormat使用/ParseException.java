package A07_SimpleDateFormat使用;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    字符串转成日期对象
- SimpleDateFormat调用方法Date parse(String str)

 */
public class ParseException {
    public static void main(String[] args) throws java.text.ParseException {

        /**
         *  dateString用户输入的日期
         *  转成Date对象
         *  前提 : 格式必须和SimpleDateFormat("格式一致")
         */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2021-04-13";
        //sdf对象的方法parse
        Date date = sdf.parse(dateString);
        System.out.println("date = " + date);
    }
}
