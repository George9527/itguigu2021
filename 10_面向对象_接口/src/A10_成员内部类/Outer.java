package A10_成员内部类;

/**
 *    成员内部类,是一个类定义在了另一个类的成员位置.这个内部类可以使用成员修饰符,public static final private .
 *
 *   对于内部来说 : 可以直接使用外部类的成员,如果外部类要使用内部类的成员,必须要创建对象.
 *
 *  公式 : 外部类名.内部类名 自定义属性 = new 外部类对象().new 内部类对象()
 */

// 外部类
public class Outer {

    public void outer() {
        System.out.println("外部类的方法outer");
    }

    // 内部类
    public class Inner {
        public void inner() {
            System.out.println("内部类的方法inner");
        }
    }



    public static void main(String[] args) {

        // 调用内部类的发inner()
        // 公式 : 外部类名.内部类名 = new 外部类对象().new 内部类对象()

        Outer.Inner oi = new Outer().new Inner();
        oi.inner();

    }
}
