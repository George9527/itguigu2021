package A01_反射的概述;

/**
    获得类或者对象的字节码文件对象
        1.object类的getClass() 方法
        2.类型class属性
        3.Class类的forname() 方法

    同一个类的对象或者同一个类得到的字节码文件对象是否是同一个？

 */
public class Demo01 {

    public static void main(String[] args) throws Exception{
        //object类的getclass方法
        Person p = new Person();
        Class class01 = p.getClass();

        Person p2 = new Person();
        Class class05 = p.getClass();

        Student s = new Student();
        Class class02 = s.getClass();

        Class class03 = int.class;
        Class class04 = Integer.class;

        System.out.println(class01 == class02);
        System.out.println(class01 == class05);
        // 这里比较的对象的 class 文件，主要是同一个对象获取的clss文件也是相同的
        // 不是根据对象的内存地址来比较的

        // Class类的forName()
        Class class06 = Class.forName("A01_反射的概述.Person");
        Class class07 = Class.forName("A01_反射的概述.Student");
    }
}
