package B02_面向对象案例求圆面积;
/*
    2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
public class CircleTest {
    public static void main(String[] args) {
        //新建一个对象
        Circle c1 = new Circle();

        //设置圆半径
        c1.radius = 5.2;

        //调用求圆面积方法
        double res = c1.getArea();
        System.out.println("方法一圆面积：" + res);

        c1.getArea2();
    }
}
