package A06_常量_Constant;

public class ConstantExer01 {
    public static void main(String[] args) {

        // 测试各种常量的写法
        System.out.println("这是一个字符串常量");	// √普通字符串
        System.out.println("a");                    // √只包含一个字符的字符串

        System.out.println('b');                    // √正常字符
        // System.out.println('abc');                  ×单引号中不能有多个字符

        System.out.println(" ");						// √空字符串

        System.out.println(5566);					// √普通整数：正数
        System.out.println(-5566);					// √普通整数：负数

        // System.out.println(2200000000);整数常量默认是int类型，超出这个范围就无法表示了
        System.out.println(2200000000L);			// √超过int类型的整数，加上L用长整型表示
        System.out.println(33.33662);				// √普通浮点数：默认是double类型
        System.out.println(33.33662f);				// √普通浮点数：加上f表示是float类型

        System.out.println(true);					// √布尔值中表示真
        System.out.println(false);					// √布尔值中表示假
    }
}
