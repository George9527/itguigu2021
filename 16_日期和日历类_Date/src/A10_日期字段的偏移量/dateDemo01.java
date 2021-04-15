package A10_日期字段的偏移量;

import java.time.LocalDate;

/*
    - 设置日期字段的偏移量, 方法名plus开头,向后偏移
    - 设置日期字段的偏移量, 方法名minus开头,向前偏移
 */
public class dateDemo01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        //月份偏移10个月 --- 方法名minus开头,向前偏移
        LocalDate minusMonths = localDate.minusMonths(10);
        System.out.println("minusMonths = " + minusMonths);

        //月份偏移10个月 --- 方法名plus开头,向后偏移
        LocalDate localDate1 = LocalDate.now();
        LocalDate plusMonths = localDate1.plusMonths(10);
        System.out.println("plusMonths = " + plusMonths);
    }
}
