package B02_if语句;

/*
	if语句格式1

	格式：
		if (关系表达式) {
			语句体;
		}

	执行流程：
		1:首先计算关系表达式的值
		2:如果关系表达式的值为true就执行语句体
		3:如果关系表达式的值为false就不执行语句体
		4:继续执行后面的语句内容
*/

public class ifDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");

        //定义两个变量
        int a = 10;
        int b = 20;

        //需求：判断a和b的值是否相等，如果相等，就在控制台输出：a等于b
        if (a == b) {
            System.out.println("A等于B");
        }

        //需求：判断a和C的值是否相等，如果相等，就在控制台输出：a等于C
        int c = 10;
        if (a == c) {
            System.out.println("A等于C");
        }

        System.out.println("结束");
    }
}
