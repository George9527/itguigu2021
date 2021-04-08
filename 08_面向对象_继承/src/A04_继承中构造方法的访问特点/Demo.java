package A04_继承中构造方法的访问特点;
/*
    测试类
*/
public class Demo {
    public static void main(String[] args) {
        //创建对象
        Zi z = new Zi();
        // 子类中的所有方法默认都会访问父类中的无参构造方法

        System.out.println("=======");

        Zi z2 = new Zi(20);
        // 子类中的所有方法默认都会访问父类中的无参构造方法
    }
}