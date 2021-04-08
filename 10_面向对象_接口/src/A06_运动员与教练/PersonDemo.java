package A06_运动员与教练;
/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建运动员对象

        //使用无参方法进行调用测试
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("郭富城");
        ppp.setAge(25);
        System.out.println(ppp.getName() + ":" + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();

        //使用带参方法进行调用
        PingPangPlayer pp = new PingPangPlayer();
        pp = new PingPangPlayer("刘德华",25);
        System.out.println(pp.getName() + ":" + pp.getAge());
        pp.eat();
        pp.study();
        pp.speak();

        //创建篮球运动员
        BasketballCoach bp = new BasketballCoach();
        bp = new BasketballCoach("姚明",30);
        bp.eat();
        bp.teach();
        //会报错---篮球运动员中没有 Speak() 方法
        //bp.skeak();
        System.out.println(bp.getName() + ":" + bp.getAge());

        //创建乒乓球教练
        PingPangCoach pc = new PingPangCoach();
        pc = new PingPangCoach("张国荣",36);
        System.out.println(pc.getName() + ":" + pc.getAge());
        pc.eat();
        pc.teach();
        pc.speak();
    }
}
