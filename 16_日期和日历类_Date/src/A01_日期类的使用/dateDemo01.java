package A01_日期类的使用;

import java.util.Date;

/*
    创建简单的日期与日历类的对象

 */
public class dateDemo01 {
    public static void main(String[] args) {
        /**
         *  创建对象,使用有参数的构造方法
         */
        Date date1 = new Date(0);
        System.out.println("date1 = " + date1);

        /**
         * 创建对象,使用无参数的构造方法
         */
        Date date2 = new Date();
        //Tue Apr 13 10:33:40 CST 2021
        System.out.println("date2 = " + date2);

        /**
         *  getTime()
         *  setTime()
         */
        //获取毫秒值 long getTime() 返回当前日期对应的毫秒值
        long time1 = date2.getTime();
        System.out.println(time1);

        //设置日期 void setTime(long 毫秒值) 日期设定到毫秒值上
//        date1.setTime(0);
        date1.setTime(16184798);
        System.out.println(date1);
    }
}
