package A02_获取Class的三种方式;

/**
获取Class对象的四种方式
（1）类型名.class
要求编译期间已知类型
（2）对象.getClass()
获取对象的运行时类型
（3）Class.forName(类型全名称)，通常需要配置文件配置配合使用
 可以获取编译期间未知的类型
（4）ClassLoader的类加载器对象.loadClass(类型全名称)
可以用系统类加载对象或自定义加载器对象加载指定路径下的类型
 */
public class TestReflect {
    public static void main(String[] args) {
        //第一种方式获取Class: 类型名.class
        //Class<Person> clazz = Person.class;
        // 一般不会指定泛型

        Class clazz = Person.class;

        // 第二种方式获取Class: 对象.getClass()
        Person p2 = new Person();
        Class clazz02 = p2.getClass();

        // 第二种方式获取Class: 对象.getClass()第三种方式获取Class: Class.forName("类的全限定名")
//        Class clazz03 = Class.forName("A02_获取Class的三种方式.Person");


    }
}
