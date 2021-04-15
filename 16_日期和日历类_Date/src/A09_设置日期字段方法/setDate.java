package A09_设置日期字段方法;

import java.time.LocalDate;

/*
    设置日期字段的方法 : 名字是with开头

- LocalDate withYear(int year)设置年份

- LocalDate withMonth(int month)设置月份

- LocalDate withDayOfMonth(int day)设置月中的天数

- > LocalDate对象是不可比对象,设置方法with开头,返回新的LocalDate对象
 */
public class setDate {
    public static void main(String[] args) {

        // 获取当前年,月,日
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        //设置年,月,日
        //方法调用链
        LocalDate newLocal = localDate.withYear(2025).withMonth(10).withDayOfMonth(25);
        System.out.println("newLocal = " + newLocal);

    }
}
