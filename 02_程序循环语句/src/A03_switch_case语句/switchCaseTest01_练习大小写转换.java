package A03_switch_case语句;

import java.util.Scanner;

/*
    1.使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输
出 “other”。
提示： String word = scan.next(); char c = word.charAt(0); switch(c){}
 */
public class switchCaseTest01_练习大小写转换 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个小写字母");

        String word = scan.next();
        char c = word.charAt(0);
        switch (c) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("Other");
        }
    }
}
