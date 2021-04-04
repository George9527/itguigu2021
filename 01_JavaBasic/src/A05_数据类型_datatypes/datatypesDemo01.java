package A05_数据类型_datatypes;
/*
	基本数据类型：
		byte,short,int,long,float,double,char,boolean

	变量的使用：
		取值格式：变量名

		修改值格式：变量名 = 变量值;

	变量使用的注意事项：
		名字不能重复
		变量未赋值，不能使用
		变量的取值范围
		long类型的变量定义的时候，为了防止整数过大，后面要加L
		float类型的变量定义的时候，为了防止类型不兼容，后面要加F

	Java定义的数据类型

一、变量按照数据类型来分：

	基本数据类型：
		整型：byte \ short \ int \ long
		浮点型：float \ double
		字符型：char
		布尔型：boolean

	引用数据类型：
		类(class)
		接口(interface)
		数组(array)


二、变量在类中声明的位置：
		成员变量  vs  局部变量
*/
public class datatypesDemo01 {
    public static void main(String[] args) {
        //定义byte类型的变量
        byte b = 10;
        System.out.println(b);

        //定义short类型的变量
        short s = 100;
        System.out.println(s);

        //定义int类型的变量
        int i = 10000;
        System.out.println(i);

        //定义char类型的变量
        char c = 'a';
        System.out.println(c);

        //定义Boolean类型的变量
        boolean bb = true;
        System.out.println(bb);

        //定义long类型的变量
//        long l = 100000000;
//        System.out.println(l);
        // 定义long类型 需要添加 L或者l 否则报错
        long l = 100000000L;
        long l2 = 10000000l;
        System.out.println(l);
        System.out.println(l2);

        // 定义float类型的变量
        float f = 13.14F;
        System.out.println(f);

        //定义double类型的变量
        // 注意： 在浮点数 (float 与 double 中 double为默认值)
        // 即小数常量值，无论多少，不加F，就是double类型
        double d = 13.14;
        System.out.println(d);

    }
}
