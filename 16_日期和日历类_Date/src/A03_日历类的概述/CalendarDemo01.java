package A03_日历类的概述;

import java.util.Calendar;

/*
    ### 3.3 日历类 Calendar

  日历类 : java.util.Calendar

  日历字段 : 组成日历的每个部分,都称为日历字段 : 年,月,日,时分秒,星期

  Calendar抽象类,不能建立对象,子类继承 : GregorianCalendar (格林威治)

#### 3.3.1 获取Calendar类的对象

  由于创建日历对象的过程非常的繁琐,考虑语言,时区...  Sun公司工程师开发了一简单获取对象的方式,不要自己new

- Calendar类定义了静态方法 : static Calendar getInstance() 返回的是Calendar 的子类的对象 GregorianCalendar

#### 3.3.2 日历类的方法

- int get(int field) 返回给定日历字段的值
  - 日历中的任何数据,都是int类型
  - 参数是具体的日历字段,传递年,月,日
  - 日历字段的写法,看Calendar类的静态成员变量
 */
public class CalendarDemo01 {
    public static void main(String[] args) {

        // Calendar抽象类,不能建立对象,子类继承 : GregorianCalendar (格林威治)
//        Calendar calendar = new Calendar();

        /**
         * Calendar类的方法get()
         * 获取日历字段
         */

        Calendar calendar =  Calendar.getInstance();

        System.out.println( calendar.get(Calendar.YEAR)+"年" + (calendar.get(Calendar.MONTH) +1)+"月" +
                calendar.get(Calendar.DAY_OF_MONTH)+"日" + calendar.get(Calendar.HOUR_OF_DAY)+"点" +
                calendar.get(Calendar.MINUTE)+"分"+calendar.get(Calendar.SECOND)+"秒");
    }

}
