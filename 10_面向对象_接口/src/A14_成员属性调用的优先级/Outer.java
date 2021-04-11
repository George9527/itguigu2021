package A14_成员属性调用的优先级;
/*
    就近原则，当调用内部类时，优先使用内部类里面的变量

 */
public class Outer {
    int x = 2;
    public class Inner {
        int x = 1;
        public void inner() {
            int x = 0;

            System.out.println("内部类方法 X：" + x); // 0
            System.out.println("内部类 X：" + this.x); // 1
            System.out.println("外部类 X：" + Outer.this.x); // 2
        }
    }
}
