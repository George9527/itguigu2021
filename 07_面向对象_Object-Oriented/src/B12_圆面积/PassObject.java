package B12_圆面积;
/*
（ 2） 定义一个类PassObject，
        在类中定义一个方法printAreas()，
            该方法的定义如下：
            public void printAreas(Circle c, int time)
            在printAreas方法中打印输出1到time之间的每个整数半径值， 以及对应的面积。
            例如， times为5， 则输出半径1， 2， 3， 4， 5， 以及对应的圆面积。

 */
public class PassObject {

    //定义一个方法printAreas()
    public void printAreas(Circle c, int time) {
        System.out.println("Radius          Area");
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "             " + c.findArea());
        }
        c.radius = (time + 1.0);
    }

}
