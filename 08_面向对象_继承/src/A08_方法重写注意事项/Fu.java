package A08_方法重写注意事项;

public class Fu {

    private void show() {
        System.out.println("Fu中show()方法被调用");
    }

    /*
    public void method() {
        System.out.println("Fu中method()方法被调用");
    }
    */

    void method() {
        System.out.println("Fu中method()方法被调用");
    }
}