package A01_继承概述;
/*
    测试类
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Fu f = new Fu();
        f.show();

        Zi z = new Zi();
        z.method();

        //子类要先继承父类才能调用父类的方法
        z.show();

        // 可以使用匿名对象
        new Zi().show();
    }
}
