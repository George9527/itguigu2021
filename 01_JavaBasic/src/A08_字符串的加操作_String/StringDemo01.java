package A08_字符串的加操作_String;
/*
    String类型变量的使用
        1.String属于引用数据类型，翻译为：字符串
        2.声明String类型变量时，使用一对 “”
        3.String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+
        4.运算结果仍然是String类型
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "a";
        String s3 = " ";

        //这里的 char 是字符不是字符串
        char c = '1';
        System.out.println(c);

        int number= 1001;
        String numbers = "学号:";
        String info = numbers + number;
        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info1);

        //练习1 --- 字符的加操作
       char c1 = 'a'; //a 的ASCII值：97
       int num = 10;
       String str = "Hello";

       System.out.println(c1 + num + str); //107 Hello
       System.out.println(c1 + str + num); //a Hello 10
       System.out.println(c1 + (num + str)); //a 10 Hello
       System.out.println((c1 + num) + str); //107 Hello
       System.out.println(str + c1 + num); //Hello a 110
        //小结：算术表达式中包含多个基本数据类型的值的时候，
        //整个算数表达式的类型会自动进行提升
        //byte、short、char 会自动提升为 int 类型

        //练习2
        String s5 = "123";
        System.out.println("S5:" + s5);
        //int i5 = (int) s5;
        //字符串不能直接转换为基本类型，但通过基本类型对于的包装类
        //则可以实现把字符串转换成基本类型

        int i5 = Integer.parseInt(s5);
        System.out.println("i5:" + i5);

    }
}
