package A05_日历字段的偏移量;

import java.util.Calendar;

/*
    add() 设置日历字段的偏移量
- add(int field,int value) field要修改的字段,value具体的数据
 */
public class calendarAdd {
    public static void main(String[] args) {

        /**
         * Calendar类的方法add()
         * 设置日历字段的偏移量
         */

        Calendar calendar = Calendar.getInstance() ; //和操作系统时间一样
        //日历向后,偏移180天
        calendar.add(Calendar.DAY_OF_MONTH,180);
        // 输出修改后的日期
        System.out.println( calendar.get(Calendar.YEAR)+"年" + (calendar.get(Calendar.MONTH) +1)+"月" +
                calendar.get(Calendar.DAY_OF_MONTH)+"日");
    }
}
