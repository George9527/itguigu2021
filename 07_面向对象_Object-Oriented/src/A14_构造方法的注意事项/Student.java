package A14_构造方法的注意事项;

/*
    学生类

    构造方法：
        作用：创建对象
        功能：完成对象数据的初始化

    格式：
        修饰符 类名(参数) {

        }

        修饰符一般用：public
 */
public class Student {

    private String name;
    private int age;

    //构造方法
//    public Student() {
//        System.out.println("无参构造方法");
//    }
    //手动创建无参数构造方法
    public Student() {}

   public Student(String name) {
       this.name = name;
   }

   public Student(int age) {
        this.age =age;
   }

    public void show() {
        System.out.println(name + "," + age);
    }

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
}