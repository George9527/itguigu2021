package B12_圆面积;
/*
    （ 1） 定义一个Circle类，
        包含:一个double型的radius属性代表圆的半径，
            一个findArea()方法返回圆的面积。
    （ 2） 定义一个类PassObject，
        在类中定义一个方法printAreas()，
            该方法的定义如下：
            public void printAreas(Circle c, int time)
            在printAreas方法中打印输出1到time之间的每个整数半径值， 以及对应的面积。
            例如， times为5， 则输出半径1， 2， 3， 4， 5， 以及对应的圆面积。
   （ 3） 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。 程序运行结果如图所示。
 */
public class ValueTransferTest01 {

    public static void main(String[] args) {

        // 创建Circle类的对象
        Circle c = new Circle();

        //创建PassObject类的对象
        PassObject p = new PassObject();
        p.printAreas(c,5);

        System.out.println("Now Radius is:" + c.radius);
    }

}
