package A02_接口成员的特点;
/*
    测试类
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new Interimpl();
        //不能给接口中的常量进行赋值
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(i.num3);
        //可以通过接口名直接访问常量
        System.out.println(Inter.num);
        System.out.println(Inter.num2);
        System.out.println(Inter.num3);

        //调用接口方法
        i.eat();

        i.show();
    }
}
