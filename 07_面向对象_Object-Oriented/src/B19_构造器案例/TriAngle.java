package B19_构造器案例;

/*
需求：
    1.编写两个类， TriAngle和TriAngleTest，
    2.其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
    3.另一个类中使用这些公共方法， 计算三角形的面积。
 */

public class TriAngle {

    // 声明私有的底边长base和高height
    private double base;
    private double height;

    // 公共方法访问私有变量。
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 计算三角形的面积
    public void getArea(double base, double height) {
        // 计算三角形的面积
        double area = (base * height) / 2.0;
        System.out.println("三角形的面积：" + area);
    }
}
