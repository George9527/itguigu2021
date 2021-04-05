package B02_面向对象案例求圆面积;
/*
    2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
public class Circle {

    // 自定义属性
    double radius;

    // 求圆面积方法一 --- 返回一个double类型的值，需要接收后打印输出
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    //求圆面积方法二 --- 这种方法不需要返回值
    public void getArea2() {
        double area = Math.PI * radius * radius;
        System.out.println("方法二圆面积：" + area);
    }

}
