package A08_LocalDate本地日期;

import java.time.LocalDate;

/*
    获取日期字段的方法 : 名字是get开头

- int getYear() 获取年份
- int getDayOfMonth()返回月中的天数
- int getMonthValue() 返回月份
 */
public class getDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        // 获取年份
        int year = localDate.getYear();
        //获取月份
        int monthValue = localDate.getMonthValue();
        //获取天数
        int dayOfMonth = localDate.getDayOfMonth();

        System.out.println("年 = " + year);
        System.out.println("月 = " + monthValue);
        System.out.println("日 = " + dayOfMonth);

    }
}
