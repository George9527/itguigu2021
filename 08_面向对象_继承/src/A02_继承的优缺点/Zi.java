package A02_继承的优缺点;
/*
   子类
 */
public class Zi extends Fu {
    //身高
    public int height = 175;

    //年龄
    public int age = 25;

    public void show() {
        int age = 30;
        System.out.println(age);
        System.out.println(height);
        //报错---父类及子类中均没有
//        System.out.println(weight);
    }
}