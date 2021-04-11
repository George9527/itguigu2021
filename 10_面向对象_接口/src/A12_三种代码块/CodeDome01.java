package A12_三种代码块;
/*
    静态代码块
    写在类中方法外面 : static{}
> 静态代码块的执行时机 : 只要使用了这个类的成员(new对象,调用静态方法,静态变量),静态代码块就会执行,而且就一次
 */
public class CodeDome01 {
    static {
        System.out.println("静态代码块");
    }

    public static int a = 1;
}
