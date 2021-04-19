package A04_泛型接口;
/*
    测试类
 */
public class GenericDemo {
    public static void main(String[] args) {
        //创建对象
        Generic<String> g1 = new GenericImpl<String>();
        g1.show("张国荣");

        Generic<Integer> g2 = new GenericImpl<Integer>();
        g2.show(20);
    }
}
