package A11_匿名内部类;
/*
概述：
    匿名内部类,就是没有名字的内部类,只能写在方法中,为了简化代码书写.
    简化 : 实现类,实现接口,重写方法,创建对象.
        或者是子类继承父类,重写方法,创建对象.代码上少内容.

匿名内部类使用的前提 :
    必须有接口实现,或者是类的继承

格式 :
    new 接口或者父类(){
        //重写抽象方法
    };

    格式 == 实现类,实现接口,重写方法,创建对象

 */
public class InnerClassTest {

    public static void main(String[] args) {
        //匿名内部类,简化书写,不写实现类
        //同时调用多个重写方法
        /*
         *  new MyInter(){}; 是接口实现类的匿名对象
         * 多态 : 接口 变量 = 实现类对象
         */

        MyInter myInter = new MyInter(){
            @Override
            public void inter() {
                System.out.println("实现类实现接口重写方法");
            }

            @Override
            public void inter2() {
                System.out.println("实现类实现接口重写方法2222");
            }
        };

        // 调用方法
        myInter.inter();
        myInter.inter2();
    }
}
