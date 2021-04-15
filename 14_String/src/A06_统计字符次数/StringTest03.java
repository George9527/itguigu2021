package A06_统计字符次数;

/*
    需求：
        键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)

    思路：
        1:键盘录入一个字符串，用 Scanner 实现
        2:要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
        3:遍历字符串，得到每一个字符
        4:判断该字符属于哪种类型，然后对应类型的统计变量+1
            假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
            大写字母：ch>='A' && ch<='Z'
            小写字母： ch>='a' && ch<='z'
            数字： ch>='0' && ch<='9'
        5:输出三种类型的字符个数
 */

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        System.out.println("-----统计字符次数-----");
        //键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //遍历字符串，得到每一个字符
        for (int i=0; i<line.length(); i++) {
            char check = line.charAt(i);

            //判断该字符属于哪种类型，然后对应类型的统计变量+1

                //大写字母：ch>='A' && ch<='Z'
            if (check>='A' && check<='Z') {
                bigCount++;
                //小写字母： ch>='a' && ch<='z'
            } else if (check>='a' && check<='z') {
                smallCount++;
                //数字： ch>='0' && ch<='9'
            } else if (check>='0' && check<='9') {
                numberCount++;
            }
        }
        //输出三种类型的字符个数
        System.out.println("大写字符共计：" + bigCount);
        System.out.println("小写字符共计：" + smallCount);
        System.out.println("数字字符共计：" + numberCount);
    }
}
