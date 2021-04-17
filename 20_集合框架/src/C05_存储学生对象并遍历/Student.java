package C05_存储学生对象并遍历;

/*
    学生类
 */

public class Student {
    private String name;
    private int age;

    //无参构造方法
    public Student() {}

    //带参构造方法
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    // Get()/Set()
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
