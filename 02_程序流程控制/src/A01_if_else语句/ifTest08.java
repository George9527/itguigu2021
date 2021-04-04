package A01_if_else语句;

import java.util.Scanner;

/*
    if语句练习4
大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出
一定的条件：高： 180cm以上；富：财富1千万以上；帅：是。
 如果这三个条件同时满足，则：“我一定要嫁给他!!!”
 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
 如果三个条件都不满足，则：“不嫁！”
Sysout(“身高: (cm))
scanner.nextInt();
Sysout(“财富: (千万))
scanner.nextDouble();
Sysout(“帅否: (true/false)) (是/否)
scanner.nextBoolean();
scanner.next(); “是”.equals(str)
 */

public class ifTest08 {
    public static void main(String[] args) {

        //自定义变量
        boolean handsome = false;

        //提示输入 男方条件
        Scanner sc = new Scanner(System.in);
        System.out.print("输入您的身高(cm)：");
        int height = sc.nextInt();
        System.out.print("输入您的身家(千万)：");
        double money = sc.nextDouble();
        System.out.print("帅？(Y/N):");
        String handsomeStr = sc.next();

        //处理 帅 条件
        if (handsomeStr.equals("y") | handsomeStr.equals("Y")) {
            handsome = true;
        } else if (handsomeStr.equals("N") | handsomeStr.equals("n")) {
            //pass
        } else {
            System.out.println("输入有误");
            System.exit(0);
        }

        //if - else 结构
        //如果这三个条件同时满足，则：“我一定要嫁给他!!!”
        if (height >= 180 && money >= 1.0 && handsome) {
            System.out.println("女孩：高富帅!!! 我一定要嫁给他!!!");

            //如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
        } else if (height >= 180 | money >= 1.0 | handsome) {
            if (height >= 180) {
                System.out.println("女孩：老实人,挺高的嫁吧!!!比上不足，比下有余。");
            } else if (money >= 1.0) {
                System.out.println("女孩：老实人,挺有钱的嫁吧!!!比上不足，比下有余。");
            } else if (handsome) {
                System.out.println("女孩：老实人,挺帅的嫁吧!!!比上不足，比下有余。");
            }
            //如果三个条件都不满足，则：“不嫁！”
        } else if (height < 180 | money < 1.0 | handsome) {
            System.out.println("女孩：你是个好人!!!");
        }
    }
}