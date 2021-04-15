package A04_用户登陆;

/*
    需求：
        已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示

    思路：
        1:已知用户名和密码，定义两个字符串表示即可
        2:键盘录入要登录的用户名和密码，用 Scanner 实现
        3:拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals() 方法实现
        4:用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
 */

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        //已知用户名和密码，定义两个字符串表示即可
        String username = "root";
        String password = "123456";

        //用循环实现多次机会，这里的次数明确，
        // 采用for循环实现，并在登录成功的时候，使用break结束循环

        for (int i = 0; i < 3; i++) {
            //键盘录入要登录的用户名和密码，用 Scanner 实现
            Scanner sc = new Scanner(System.in);

            //键盘录入要登录的用户名
            System.out.print("请输入用户名：");
            String name = sc.nextLine();
            //键盘录入要登录的密码
            System.out.print("请输入登陆密码：");
            String pwd = sc.nextLine();

            //拿键盘录入的用户名、密码和已知的用户名、密码进行比较，
            // 给出相应的提示。字符串的内容比较，用equals() 方法实现
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (i == 2) {
                    System.out.println("登陆失败次数过多！");
                    System.out.println("账号已被锁定");
                    break;
                } else {
                    System.out.println("登陆失败！");
                    System.out.println("还剩余" + (2 - i) + "次机会");
                }
            }
        }
    }
}
