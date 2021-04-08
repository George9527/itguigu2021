package A07_方法重写;
/*
    测试类
 */
public class PhoneDemo {
    public static void main(String[] args) {

        //创建对象，调用方法
        Phone p = new Phone();
        p.call("张国荣");

        System.out.println("----------");

        NewPhone p2 = new NewPhone();
        p2.call("刘德华");
    }
}
