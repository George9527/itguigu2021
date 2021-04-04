package A17_Scaner数据导入;

import java.util.Scanner;

/*
	数据输入：
		导包：
			import java.util.Scanner;
		创建对象：
			Scanner sc = new Scanner(System.in);
		接收数据：
			int x = sc.nextInt();
	小结：

1、Scanner的方法简单说明
nextlnt()：只读取int值，只能读取整数类型的数据，如果输入了非整型的数据（浮点型字符串等）就会报错。

2、next()和nextLine()的区别
next()：只读取输入直到空格。不能读取两个由空格或符号隔开的单词。
nextLine()： 读取输入，包括单词之间的空格和除回车以外的所有符号

更多方法查api文档
*/
public class ScannerDemo01 {
    public static void main(String[] args) {
        //创建对象：
        Scanner sc = new Scanner(System.in);

        //打印接受数据提示
        System.out.print("输入一个整数：");

        //接收数据
        //int x = sc.nextInt(); // --- 只读取int值，只能读取整数类型的数据，如果输入了非整型的数据（浮点型字符串等）就会报错。
        //String x = sc.next();  // --- 字符串 --读取输入直到空格。不能读取两个由空格或符号隔开的单词。
        String x = sc.nextLine(); // --- 读取输入，包括单词之间的空格和除回车以外的所有符号

        //输出数据
        System.out.println("输入的数字为：" + x);
    }
}
