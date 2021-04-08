package A08_方法重写注意事项;

public class Zi extends Fu {

    // 这里不能重写父类中的 private 方法
    // 因为子类的访问方法不能更加低

//    @Override
//    public void method() {
//        System.out.println("Zi中method()方法被调用");
//    }


    @Override
    public void method() {
        System.out.println("Zi中method()方法被调用");
    }
}