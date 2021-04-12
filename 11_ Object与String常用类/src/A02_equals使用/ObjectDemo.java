package A02_equals使用;

/*
    测试类

    public boolean equals​(Object obj)：指示一些其他对象是否等于此
    看方法的源码，选中方法，按下 Ctrl+B
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(30);

        //需求：比较两个对象的内容是否相同
        System.out.println(s1 == s2);
        // false 这里比较的是两个对象的内存地址值
        // 因为是 new 两个不同的对象，所以结果为 false

        System.out.println(s1.equals(s2));

        /*
        源码：
            public boolean equals(Object obj) {
                //this -- s1
                //obj -- s2
                return (this == obj);
            }
         */

    }
}