package A02_equals使用;

public class Person {

    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 重写equals,建立Person对象自己的比较方式
     * 比较对象的age年龄,年龄相同返回true
     */

    public boolean equals(Object obj){
        //健壮性判断,如果obj对象的值是null,比较的另一个对象不存在
        if (obj == null){
            return false;
        }
        //判断this和参数obj是不是一个对象 "p1" 如果是,返回true
        //怎么确定this和obj是不是一个对象,内地地址要是一样
        if ( this == obj ) {
            return true;
        }
        //比较对象的年龄,this和obj
        //obj向下转型为Person,安全性判断
        if (obj instanceof  Person) {//obj是Person对象
            Person p = (Person) obj;
            return this.age == p.age;
        }
        //不是Person,没有可比性
        return false;
    }

}
