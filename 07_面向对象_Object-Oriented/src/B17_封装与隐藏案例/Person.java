package B17_封装与隐藏案例;
/*
    1.创建程序,在其中定义两个类： Person和PersonTest类。 定义如下：
        用setAge()设置人的合法年龄(0~130)， 用getAge()返回人的年龄。
        在 PersonTest 类 中 实 例 化 Person 类 的 对 象 b ，
        调 用 setAge() 和getAge()方法， 体会Java的封装性。

    Person
        -age:int
        +setAge(i: int)
        +getAge(): int

 */
public class Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if ( a < 0 || a > 130) {
            System.out.println("传入的数据非法");
            return;  // 体现了return 用于结束方法的用途
        } else {
            age = a;
        }
    }

}
