package A04_修改日历的值;

import java.util.Calendar;

/*
    void set() 修改日历的值
        - set(int field,int value)field要修改的字段,value具体的数据
        - set(int,int,int) 传递年月日
 */
public class calendarSet {

    public static void main(String[] args) {

        /**
         * Calendar类的方法set()
         * 设置日历字段
         */

        // 获取操作系统的时间
        Calendar calendar = Calendar.getInstance();

        // 重新设置当前时间 --- 注意这里的月份 系统月份范围 0-11
        calendar.set(2021,6 - 1,30);

        //设置某一个字段 这里仅设置 日
//        calendar.set(Calendar.DAY_OF_MONTH,30);

        // 输出修改后的日期
        System.out.println( calendar.get(Calendar.YEAR)+"年" + (calendar.get(Calendar.MONTH) +1)+"月" +
                calendar.get(Calendar.DAY_OF_MONTH)+"日" + calendar.get(Calendar.HOUR_OF_DAY)+"点" +
                calendar.get(Calendar.MINUTE)+"分"+calendar.get(Calendar.SECOND)+"秒");
    }
}
