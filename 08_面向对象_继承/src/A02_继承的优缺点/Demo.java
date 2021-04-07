package A02_继承的优缺点;

/*
    测试类
        小结：1：如果子类中有该方法，就不会去调用父类中的方法
 */

public class Demo {
    public static void main(String[] args) {

        //创建对象，调用方法
        Zi z = new Zi();
        z.show();
        // 小结：如果子类中有该方法，就不会去调用父类中的方法
    }
}
