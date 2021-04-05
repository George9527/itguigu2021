package B19_构造器案例;

/*
需求：
    1.编写两个类， TriAngle和TriAngleTest，
    2.其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
    3.另一个类中使用这些公共方法， 计算三角形的面积。
 */

public class TriAngleTest {

    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();

        t1.setBase(2.0);
        t1.setHeight(4.0);

        System.out.println("底边长：" + t1.getBase() + " 高：" + t1.getHeight());
        t1.getArea(2.0,4.0);
    }

}
