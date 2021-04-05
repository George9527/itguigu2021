package A18_对象案例_游客与门票;

/*
    需求：
        ①：12岁以下免门票，门票20元
        ②：输入 exit 退出
        ③；编写出游客类
        ④：根据年龄段显示门票价格
    思路：
        ①：无限循环体
 */

import java.util.Scanner;

public class Tourer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 死循环体
        for (;;) {
            TourerInfo person = new TourerInfo();
            System.out.print("请输入姓名：");
            person.name = input.next();
            if (person.name.equals("exit")) {
                break;
            } else {
                System.out.print("请输入年龄：");
                person.age = input.nextInt();
            }

            // 调用方法 输出处理结果
            person.metch(person.name, person.age);
        }
    }
}
