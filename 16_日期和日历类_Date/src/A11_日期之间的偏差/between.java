package A11_日期之间的偏差;

/*
    Period 计算日期之间的偏差
          - static Period between(LocalDate d1,LocalDate d2)计算两个日期之间的差值.
          - 计算出两个日期相差的天数,月数,年数
 */

import java.time.LocalDate;
import java.time.Period;

public class between {
    public static void main(String[] args) {

        // 获取2个对象,LocalDate
        LocalDate d1 = LocalDate.now(); // 2021-4-13

        // static LocalDate of() 获取LocalDate的对象,自己设置日期
        LocalDate d2 = LocalDate.of(2022,4,13); // 2022-6-15

        // Period静态方法计算
        Period period = Period.between(d1, d2);

        // period非静态方法,获取计算的结果
        int years = period.getYears();
        System.out.println("相差的年:"+years);
        int months = period.getMonths();
        System.out.println("相差的月:"+months);
        int days = period.getDays();
        System.out.println("相差的天:"+days);
    }
}
