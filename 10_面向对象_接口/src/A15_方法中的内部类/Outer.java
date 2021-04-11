package A15_方法中的内部类;

/**
 * Inner类，是方法Outer的局部
 * 依照方法，才能被外届访问
 */
public class Outer {
    public void outer() {
        // 类中方法中的内部类
        class Inner {
            public void innermeth() {
                System.out.println("局部内部类的方法");
            }
        }

        // 方法，建立对象
        Inner inner = new Inner();
        // 调用方法
        inner.innermeth();
    }
}
