package B12_圆面积;
/*
    （ 1） 定义一个Circle类，
        包含:一个double型的radius属性代表圆的半径，
            一个findArea()方法返回圆的面积。
 */
public class Circle {

    //一个double型的radius属性代表圆的半径
    double radius;

    //一个findArea()方法返回圆的面积
    public double findArea() {
        return (radius * radius) * Math.PI;
    }

}
