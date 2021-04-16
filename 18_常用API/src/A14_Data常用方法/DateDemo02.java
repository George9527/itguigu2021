package A14_Data常用方法;

import java.util.Date;

/*
    public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
    public void setTime(long time):设置时间，给的是毫秒值
 */
public class DateDemo02 {
    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();

        //public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
        System.out.println(d.getTime() + "毫秒");
        // x1.0 是因为要有小数参与运算
        System.out.println(d.getTime()*1.0/1000/60/60/24/365 + "年");
        //如果希望结果为整数时
        System.out.println(d.getTime()/1000/60/60/24/365 + "年");

        //public void setTime(long time):设置时间，给的是毫秒值
        //当前时间---毫秒值
        long time = 1000*60*60;
        d.setTime(time);
        System.out.println(d);

        //获取系统当前时间
        long time1 = System.currentTimeMillis();
        d.setTime(time1);
        System.out.println(d);

    }
}
