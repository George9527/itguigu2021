package A03_泛型方法;
/*
    测试类
 */
public class GenericDemo {
    public static void main(String[] args) {
//        //创建对象
//        Generic g = new Generic();
//        g.show("张国荣");
//        g.show(40);
//        g.show(true);
//        g.show(12.34);
//        // 缺点就是每使用一个新的数据类型，都需要先创建好方法

//        Generic<String> g1 = new Generic<String>();
//        g1.show("郭富城");
//
//        Generic<Integer> g2 = new Generic<Integer>();
//        g2.show(45);
//
//        Generic<Boolean> g3 = new Generic<Boolean>();
//        g3.show(true);
//
//        Generic<Double> g4 = new Generic<Double>();
//        g4.show(13.14);

        //使用改进后的泛型方法
        Generic g = new Generic();
        g.show("李白");
        g.show(60);
        g.show(true);
        g.show(12.24);

    }
}
