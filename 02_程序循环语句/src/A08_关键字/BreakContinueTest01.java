package A08_关键字;
/*
break和continue关键字的使用
				使用范围			循环中使用的作用(不同点)		相同点
break:			switch-case
				循环结构中			结束当前循环					关键字后面不能声明执行语句

continue:		循环结构中			结束当次循环					关键字后面不能声明执行语句

*/
public class BreakContinueTest01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if ( i % 4 == 0) {
//                break; // --- 123
                continue; // --- 123567910
                //System.out.println("关键字后面不能声明执行语句");
            }
            System.out.println(i);
        }

        System.out.println("===========");

        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 10; b++) {
                if ( b % 4 == 0 ) {
//                    break; // 默认跳出包裹此关键字最近的一层循环
                    continue; // 跳过 4、8 这两个满足条件的数字后继续输出
                }
                System.out.print(b);
            }
            System.out.println(" ");
        }
    }
}
