package A01_toString方法特点;
/**
 * 重写了父类的方法toString()
 * 返回字符串
 * @return
 * 重写方法目标 : 方法中,返回类中成员变量的值
 */
public class Persion {
    private String name;
    private int age;

    public Persion() {};

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写Object类中的toString()
    public String toString() {
        return name + "::" +  age;
    }
}
