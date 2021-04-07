package A03_Super关键词;

public class Zi extends Fu {

    public int age = 20;

    // 建立子类特有的 show() 方法

    public void show() {

        int age = 30;

        System.out.println("访问age的值");
        System.out.println(age);  // 30
        //我要访问本类的成员变量age，怎么办呢？
        System.out.println("访问本类的成员变量age");
        System.out.println(this.age); // 20
        //我要访问父类的成员变量age，怎么办呢？
        System.out.println("访问父类的成员变量age");
        System.out.println(super.age); // 40
    }
}
