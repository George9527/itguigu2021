package D13_数组案例_排序;

import java.util.Arrays;
import java.util.Scanner;

/*
      从键盘输入8个整数存放在一个数组中，然后将奇数和偶数分别存入到两个不同的数组中，
      并按奇数、偶数交替的顺序输出这两个数组中的所有数据
      先交替输出，如果奇数个数多，则再输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数。
    提示与要求：
        （1）定义一个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，才能定义存储奇数和偶数的数组的长度；
        （2）把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法
 */
public class ArrayTest09 {
    public static void main(String[] args) {

        // 自定义数组
        int[] num = new int[8];

        // Scaner
        Scanner scanner = new Scanner(System.in);

        // 1) 用循环从键盘输入8个整数
        for (int i = 0; i < 8; i++) {
            System.out.print("请输入" + (i + 1) + "个整数：");
            int input = scanner.nextInt();
            num[i] = input;
        }

        // 2）用循环先判断这8个整数中奇数和偶数的个数
        // 自定义计数器
        int unevenNumber = 0;
        int evenNumber = 0;

        for (int i = 0; i < num.length; i++) {
            // 取余判断奇偶数
            if (num[i] % 2 != 0) {
                unevenNumber += 1;
            } else {
                evenNumber += 1;
            }
        }

        System.out.println("奇数个数：" + unevenNumber);
        System.out.println("偶数个数：" + evenNumber);

        // 奇数和偶数数组
        int[] oopNumber = new int[unevenNumber];
        Arrays.sort(oopNumber);
        int[] pNumber =  new int[evenNumber];
        Arrays.sort(pNumber);

        // 分别讲奇偶数存进数组中
        int x = 0;
        int y = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pNumber[x] = num[i];
                x++;
            } else {
                oopNumber[y] = num[i];
                y++;
            }
        }

        // 测试输出奇数和偶数数组的长度
        System.out.println("奇数数组的长度：" + oopNumber.length);
        for (int i : oopNumber) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("偶数数组的长度：" + pNumber.length);
        for (int i : pNumber) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        // 交替输出

        // 当奇数大于偶数时
        if (unevenNumber > evenNumber) {
            for (int i = 0; i <= evenNumber - 1; i++) {
                System.out.print(oopNumber[i] + " ");
                System.out.print(pNumber[i] + " ");
            }

            int a = unevenNumber - evenNumber ;
            System.out.println(" ");
            System.out.println("a:" + a);

            for (int j = evenNumber; j < unevenNumber; j++) {
                System.out.print(oopNumber[j] + " ");
            }
        }

        System.out.println(" ");

        // 测试输出
        System.out.print("原数组： ");
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
