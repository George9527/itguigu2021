package A06_常量_Constant;
/*
	常量：
		在程序运行过程中，其值不可以发生改变的量。

	常量分类：
		字符串常量：	用双引号括起来的内容。"HelloWorld"
		整数常量：		不带小数的数字。666,-88
		小数常量：		带小数的数字。13.14,-5.21
		字符常量：		用单引号括起来的内容。'A','0','我'
		布尔常量：		布尔值，表示真假。true,false
		空常量：		一个特殊的值，空值。null
*/
public class ConstantDemo {
    public static void main(String[] args) {
        // 字符串常量
        System.out.println("-----字符串常量-----");
        System.out.println("A0_HelloWorld");
        System.out.println("中文汉字");

        // 整数常量
        System.out.println("-----整数常量-----");
        System.out.println(1234567890);
        System.out.println(-1234567890);

        // 小数常量
        System.out.println("-----小数常量-----");
        System.out.println(13.14);
        System.out.println(-5.20);

        // 字符常量
        System.out.println("-----字符常量-----");
        System.out.println('a');
        System.out.println('0');
        System.out.println('我');

        // 布尔常量
        System.out.println("-----布尔常量-----");
        System.out.println(false);
        System.out.println(true);

        // 空常量 --- 空常量不能直接输出
        System.out.println("-----空常量-----");
        // System.out.println(null);

    }
}
