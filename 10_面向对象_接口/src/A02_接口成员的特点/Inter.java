package A02_接口成员的特点;
/*
    接口
 */
public interface Inter {

    //接口中没有成员变量，默认都是 final 修饰的常量
    public int num = 10;
    public final int num2 = 20;
    int num3 = 30;

    //自定义一个抽象方法
    public abstract void eat();

    //接口里面的方法默认为抽象方法 --- 下面的代码不带 abstract 修饰符
    void show();
}
