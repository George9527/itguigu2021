package A13_静态内部类的使用;
/*
    创建一个类
        包含一给静态的内部类
 */
public class Outer {

    public void outer() {
        System.out.println("外部类的方法outer");
    }

    // 静态内部类
    public static class Inner {
        public void inner() {
            System.out.println("静态内部类的方法");
        }
    }

    // 静态内部类静态方法
    public static class Inner2 {
        public static void inner2() {
            System.out.println("静态内部类的方法");
        }
    }
}
