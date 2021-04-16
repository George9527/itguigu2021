package A19_Calender_案例二月天;

import java.util.Calendar;
import java.util.Scanner;

/*
    需求：
        获取任意一年的二月有多少天

    思路：
        1:键盘录入任意的年份
        2:设置日历对象的年、月、日
            年：来自于键盘录入
            月：设置为3月，月份是从0开始的，所以设置的值是2
            日：设置为1日
        3:3月1日往前推一天，就是2月的最后一天
        4:获取这一天输出即可

        代码：
                    //键盘录入任意的年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int user_input_year = sc.nextInt();

        //设置日历对象的年、月、日
        Calendar c = Calendar.getInstance();
        c.set(user_input_year,2,1);

        //3月1日往前推一天，就是2月的最后一天
        c.add(Calendar.DATE,-1);

        //获取这一天输出即可
        int date = c.get(Calendar.DATE);
        System.out.println(date);
 */
public class CalenderTest {
    public static void main(String[] args) {
        //键盘录入任意的年份
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int user_input_year = sc.nextInt();

        //设置日历对象的年、月、日 --- 注意月份的参数
        /*
        年：来自于键盘录入
            月：设置为3月，月份是从0开始的，所以设置的值是2
            日：设置为1日
         */
        Calendar c = Calendar.getInstance();
        c.set(user_input_year,2,1);

        //3月1日往前推一天，就是2月的最后一天
        c.add(Calendar.DATE, -1 );

        //获取这一天输出即可
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) +1;
        int date = c.get(Calendar.DATE);

        System.out.println(year + "年" + month + "月" + date + "日");
    }

}
