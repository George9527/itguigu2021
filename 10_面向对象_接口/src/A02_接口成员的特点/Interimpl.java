package A02_接口成员的特点;
/*
    接口的实现类

 */
public class Interimpl implements Inter{
    @Override
    public void eat() {
        System.out.println("重写接口中的抽象方法 eat()");
    }

    @Override
    public void show() {
        System.out.println("重写接口中的抽象方法 show()");
    }
}
