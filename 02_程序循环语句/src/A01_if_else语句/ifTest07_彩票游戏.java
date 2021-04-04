package A01_if_else语句;

import java.util.Random;
import java.util.Scanner;

/*
假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入
一个两位数，然后按照下面的规则判定用户是否能赢。
1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
提示：使用(int)(Math.random() * 90 + 10)产生随机数。
Math.random() : [0,1) * 90 [0,90) + 10 [10,100)  [10,99]
 */

public class ifTest07_彩票游戏 {
    public static void main(String[] args) {

        //程序随机地产生一个两位数的彩票
        //使用 random 生成两位数的随机数
        Random r = new Random();
        int result = r.nextInt(90) + 10; // [10,99]
        System.out.println("彩票号码为：" + result);

        //提示用户输入一个两位数
        //使用 Scanner 录入键盘的数值
        Scanner sc = new Scanner(System.in);
        System.out.print("输入购买的彩票号码：");
        int userNumber = sc.nextInt();
        System.out.println("您的彩票号码为：" + userNumber);

        //将彩票号码与用户号码 拆开两个单独数字
        int resultNum1 = result % 10;
        int resultNum2 = result / 10;
        // 测试输出
        System.out.println("彩票号码---个位：" + resultNum1);
        System.out.println("彩票号码---十位：" + resultNum2);

        int userNumber1 = userNumber % 10;
        int userNumber2 = userNumber / 10;
        // 测试输出
        System.out.println("用户号码---个位：" + userNumber1);
        System.out.println("用户号码---十位：" + userNumber2);

            //使用 if-else 根据游戏规则 判断中奖情况
            //先判断用户输入范围是否正确 [10,99]
            if (userNumber >= 10 && userNumber <= 99) {
                //(1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
                if (userNumber == result) {
                    int money = 10000;
                    System.out.println("中奖号码为：" + result + " 恭喜中头奖！您的奖金为：" + money);
                    //2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
                } else if ((userNumber1 == resultNum2) && (userNumber2 == resultNum1)) {
                    int money = 3000;
                    System.out.println("中奖号码为：" + result + " 恭喜中一等奖！您的奖金为：" + money);
                    //3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
                } else if ((userNumber1 == resultNum1) || (userNumber2 == resultNum2)) {
                    int money = 1000;
                    System.out.println("中奖号码为：" + result + " 恭喜中二等奖！您的奖金为：" + money);
                    //4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
                } else if ((userNumber1 == resultNum2) || (userNumber2 == resultNum1)) {
                    int money = 500;
                    System.out.println("中奖号码为：" + result + " 恭喜中三等奖！您的奖金为：" + money);
                    //5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
                } else if (userNumber != result) {
                    System.out.println("中奖号码为：" + result + " 没有中奖！");
                }
            } else {
                System.out.println("输入范围错误！请输入一个两位正整数");
            }
    }
}
