package A08_字符串反转;

/*
    需求：
        定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如，键盘录入 abc，输出结果 cba

    思路：
        1:键盘录入一个字符串，用 Scanner 实现
        2:定义一个方法，实现字符串反转。返回值类型 String，参数 String s
        3:在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
        4:调用方法，用一个变量接收结果
        5:输出结果
 */

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //调用方法，用一个变量接收结果
        String test = reverse(line);

        //输出结果
        System.out.println("正序：" + line);
        System.out.println("倒序：" + test);
    }

    //定义一个方法，实现字符串反转
    /*
        两个明确：
                返回值类型：String
                参数：String s
     */

    public static String reverse(String old) {
        //在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
        String ss = "";

        for (int i = old.length()-1; i>=0; i--) {
            ss += old.charAt(i);
            //ss.append(old.charAt(i));
        }
        //返回值
        return ss;
    }
}
