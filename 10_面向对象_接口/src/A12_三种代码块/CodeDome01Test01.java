package A12_三种代码块;
/*
    静态代码块的使用
        小结：
        静态代码块的执行时机 :
        只要使用了这个类的成员(new对象,调用静态方法,静态变量),
        静态代码块就会执行,而且就一次
 */
public class CodeDome01Test01 {
    public static void main(String[] args) {
        System.out.println(CodeDome01.a);

        // 只执行一次，下面的代码不再执行
//        new CodeDome01();
//        new CodeDome01();
//        new CodeDome01();
    }
}
