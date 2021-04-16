package A14_日期的差值计算;

import java.time.LocalDate;
import java.time.Period;

/**
 *  日期的差值计算
 */
public class PeriodTest {
    public static void main(String[] args) {
        //获取2个对象,LocalDate
        LocalDate d1 = LocalDate.now(); // 2021-4-13

        // 通过of() 方法来自定义时间
        LocalDate d2 = LocalDate.of(2022,4,13); // 2022-6-15

        //Period静态方法计算
        Period period = Period.between(d1, d2);

        //period非静态方法,获取计算的结果
        int years = period.getYears();
        System.out.println("相差的年:"+years);
        int months = period.getMonths();
        System.out.println("相差的月:"+months);
        int days = period.getDays();
        System.out.println("相差的天:"+days);
    }
}
