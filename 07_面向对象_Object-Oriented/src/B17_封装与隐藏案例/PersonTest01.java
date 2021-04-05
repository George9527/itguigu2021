package B17_封装与隐藏案例;
/*
    在 PersonTest 类 中 实 例 化 Person 类 的 对 象 b ，
        调 用 setAge() 和getAge()方法， 体会Java的封装性。
 */
public class PersonTest01 {

    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(80);
        System.out.println(p.getAge());
    }

}
