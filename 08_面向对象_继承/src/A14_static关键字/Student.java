package A14_static关键字;
/*
    * static的概念
    *
        * static关键字是静态的意思，可以修饰【成员方法】，【成员变量】
        * static修饰的特点
        *
          1. 被类的所有对象共享，这也是我们判断是否使用静态关键字的条件
          2. 可以通过类名调用当然，也可以通过对象名调用**【推荐使用类名调用】**
 */
public class Student {

    public String name; //姓名
    public int age; //年龄
    //    public String university; //学校

    //被所有的对象共享
    public static String university; //学校

    public void show() {
        System.out.println(name + "," + age + "," + university);
    }

}
