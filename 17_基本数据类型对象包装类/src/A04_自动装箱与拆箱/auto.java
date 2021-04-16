package A04_自动装箱与拆箱;

/*
    自动装箱 : 基本数据类型自动转成引用类型 int -> Integer
    自动拆箱 : 引用类型自动转成基本数据类型 Integer ->int
 */

public class auto {
    public static void main(String[] args) {

        //自动装箱  int类型自动转成Integer对象
        //javac编译特效 Integer integer = Integer.valueOf(1000) 本质还是new Integer
        Integer integer = 1000;
        System.out.println(integer);

        //自动拆箱 Integer类型自动转成int类型
        //javac编译特点  integer + 1;  integer.intValue()返回int类型  + 1 = 1001
        //Integer integer2 = 1001 装箱
        Integer integer2 = integer + 1;
        System.out.println(integer2);
    }
}
