package A10_老师与学生升级;
/*
    ### 老师和学生（应用）

* 需求：定义老师类和学生类，然后写代码测试；最后找到老师类和学生类当中的共性内容，抽取出一个父类，用继承的方式改写代码，并进行测试

* 步骤：

  ①定义老师类(姓名，年龄，教书())

  ②定义学生类(姓名，年龄，学习())

  ③定义测试类，写代码测试

  ④共性抽取父类，定义人类(姓名，年龄)

  ⑤定义老师类，继承人类，并给出自己特有方法：教书()

  ⑥定义学生类，继承人类，并给出自己特有方法：学习()

  ⑦定义测试类，写代码测试
 */
public class Demo {
    public static void main(String[] args) {
        //创建老师类对象

        //使用无参数方法
        Teacher t1 = new Teacher();
        t1.setName("黎明");
        t1.setAge(30);
        System.out.println(t1.getName() + ", " + t1.getAge());
        t1.teach();

        //使用带参数方法
        Teacher t2 = new Teacher("张国荣",40);
        System.out.println(t2.getName() + ", " + t2.getAge());
        t1.teach();

        //创建学生类对象

        //使用无参数方法
        Student s1 = new Student();
        s1.setName("黎明");
        s1.setAge(30);
        System.out.println(s1.getName() + ", " + s1.getAge());
        s1.study();

        //使用带参数方法
        Student s2 = new Student("张国荣",40);
        System.out.println(s2.getName() + ", " + s2.getAge());
        s2.study();
    }
}
