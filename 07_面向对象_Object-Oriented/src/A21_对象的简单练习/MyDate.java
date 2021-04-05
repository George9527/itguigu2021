package A21_对象的简单练习;
/*
    5.声明一个日期类型MyDate：
        有属性：年year,月month，日day。
    创建2个日期对象，分别赋值为：
        你的出生日期，你对象的出生日期， 并显示信息。
 */
public class MyDate {
    public static void main(String[] args) {
        // 新建一个 myDate 对象
        Date me = new Date();
        me.yaer = 2000;
        me.month = 1;
        me.day = 10;
        me.show();

        Date other = new Date();
        other.yaer = 2001;
        other.month = 12;
        other.day = 25;
        other.show();
    }
}
