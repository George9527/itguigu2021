package A17_Scaner数据导入;

import java.util.Scanner;
/*
    Scanner 的使用方法
 */
public class ScannerDemo02 {
    public static void main(String[] args){

        // 1.创建Scanner对象
        Scanner scanner = new Scanner(System.in);

        // 2.读取int类型数据
        System.out.print("请输入一个整数：");

        // 调用scanner对象的nextInt()方法
        int age = scanner.nextInt();

        System.out.println("age="+age);

        // 3.读取boolean类型数据
        System.out.print("请输入一个布尔值：");
        boolean flag = scanner.nextBoolean();

        System.out.println("flag="+flag);

        // 4.读取字符串
        System.out.print("请输入一个字符串：");

        // next()方法会因为空格而终止读取
        String strValue = scanner.next();
        System.out.println("strValue="+strValue);

        // 建议使用：
        // nextLine()方法不会因为空格而终止读取
        strValue = scanner.nextLine();
        System.out.println("strValue="+strValue);

    }
}
