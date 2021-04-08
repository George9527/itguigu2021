package A04_继承中构造方法的访问特点;

public class Zi extends Fu {

    public Zi() {
        // 每一个子类构造方法第一句都是 super();
        super(); // 可以不写
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age) {
        super();
        System.out.println("Zi中带参构造方法被调用");
    }

}