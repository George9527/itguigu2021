package B15_封装与隐藏;

public class Animal {

    String name;
    private int age;

    //将 int legs 设置为私有属性，防止在外部被访问到
//    int legs;

    //对于属性的设置
    private int legs;

    //对于属性的获取
    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = 1;
        } else {
            legs = 0;
            //(可以设置一个抛出异常)
        }
    }

    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println("Name:" + name + " |Age:" + age + " |legs:" + legs);
    }

    //提供关于属性age的get和set方法
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

}
