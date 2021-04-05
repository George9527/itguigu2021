package B04_面向对象练习矩阵面积;
/*
    3.1 编写程序， 声明一个method方法，
    在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
    3.2 修改上一个程序， 在method方法中，
    除打印一个10*8的*型矩形外， 再计算该矩形的面积，
    并将其作为方法返回值。 在main方法中调用该方法，接收返回的面积值并打印。
    3.3 修改上一个程序，在method方法提供m和n两个参数，
    方法中打印一个m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值。
    在main方法中调用该方法，接收返回的面积值并打印。
 */
public class ExerTest03 {
    public static void main(String[] args) {

        //新建一个对象
        ExerTest03 test = new ExerTest03();

        //打印一个10*8 的*型矩形，在main方法中调用该方法。
        test.method();
        System.out.println("==========");

        //除打印一个10*8的*型矩形外， 再计算该矩形的面积并将其作为方法返回值
        int area = test.method2();
        System.out.println("面积：" + area);
        System.out.println("==========");

        //打印一个m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值
        ExerTest03 test02 = new ExerTest03();
        int area2 = test02.method3(5,5);
        System.out.println("面积：" + area2);

    }

    //3.1 编写程序， 声明一个method方法，
    public void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //除打印一个10*8的*型矩形外， 再计算该矩形的面积并将其作为方法返回值
    public int method2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        return 10 * 8;
    }

    //打印一个m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值
    public int method3(int a,int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        return a * b;
    }
}
