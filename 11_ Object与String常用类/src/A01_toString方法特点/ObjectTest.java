package A01_toString方法特点;

public class ObjectTest {

    public static void main(String[] args) {

        // 创建对象使用带参构造方式来赋值
        Persion persion = new Persion("张三",5);

        // 调用Person的方法toString()
        String s = persion.toString();

        // A01_toString方法特点.Persion@3f3afe78 是对象在内存的 “A01_toString方法特点.Persion@3f3afe78”
        System.out.println(s); // 张三::5 重写了toString方法后返回的结果
        // 小结：public String toString()； 结果是字符串，是对象的内存地址
    }
}
