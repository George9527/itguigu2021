package A05_继承中成员方法的访问特点;

/*
    测试类
 */

public class Demo {
    public static void main(String[] args) {

        //创建方法，调用对象
        Zi z = new Zi();
        z.method();
        z.show();
        // 这个show是父类中的，子类的show方法，第一行默认为 super 故先调用了父类中的show方法

        // 小结：子类对象调用方法的优先级
        // ①：子类对象中
        // ②：父类对象中

        //报错 --- 子类与父类中均不存在这个方法
        //z.test();
    }
}
