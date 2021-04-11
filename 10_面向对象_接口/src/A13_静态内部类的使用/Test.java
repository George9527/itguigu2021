package A13_静态内部类的使用;
/*
    注意和成员内部类的调用区别

公式 : 外部类名.内部类名 变量名 = new 外部类对象.内部类对象()；

 */
public class Test {
    public static void main(String[] args) {
        // 内部类是静态的
        Outer.Inner oi = new Outer.Inner();
        // 调用静态方法
        oi.inner();

        // 调用静态内部类的静态方法
        Outer.Inner2.inner2();
        // 直接调用不需要创建对象
    }
}
