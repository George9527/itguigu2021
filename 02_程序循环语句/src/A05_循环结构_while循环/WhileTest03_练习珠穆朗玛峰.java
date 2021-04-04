package A05_循环结构_while循环;
/*
世界最高山峰是珠穆朗玛峰，它的高度是8844.43米，假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class WhileTest03_练习珠穆朗玛峰 {
    public static void main(String[] args) {
        // 将两个数值统一一下单位
        double height = 88444300;
        double paper = 1.0;

// 声明一个变量用于统计折纸的次数
        int count = 0;

// 声明一个变量用于保存纸折叠后的厚度
// 初始值是纸没有折叠时的厚度
        double thickness = paper;

// 只要纸的厚度还没有超过山的高度就一直循环
        while(thickness <= height){

            // 每折一次，厚度会翻倍
            thickness *= 2;

            // 每循环一次就代表折叠了一次
            count++;
        }

        System.out.println("最终纸的厚度=" + thickness);
        System.out.println("最终折叠的次数=" + count);
    }
}
