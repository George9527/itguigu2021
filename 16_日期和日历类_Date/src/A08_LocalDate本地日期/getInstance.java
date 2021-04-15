package A08_LocalDate本地日期;

import java.time.LocalDate;

/*
    获取该类的对象,静态方法
- static LocalDate now() 获取LocalDate的对象,跟随操作系统
- static LocalDate of() 获取LocalDate的对象,自己设置日期
- of方法中传递年月日 of(int year,int month,int day)
 */
public class getInstance {
    public static void main(String[] args) {

        //静态方法now()
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        //static LocalDate of() 获取LocalDate的对象,自己设置日期
        LocalDate of = LocalDate.of(2021,3,4);
        System.out.println("of: " + of);
    }
}
