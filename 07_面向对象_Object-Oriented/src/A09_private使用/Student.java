package A09_private使用;

/*
    学生类
 */
public class Student {
    private String name;
    private int age;


// 紫色name为全局变量 另一个为局部变量
    //this.name 全局代替局部变量
    public void setName(String name) {
        //name = name;
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

    public void show() {
        System.out.println(name + "," + age);
    }
}