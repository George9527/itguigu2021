package A15_方法中的内部类;

public class InnerClassTest {
    public static void main(String[] args) {
        // 调用内部类的方法inner()
        // 直接调用时不能调用
        Outer outer = new Outer();
        outer.outer();
     }
}
