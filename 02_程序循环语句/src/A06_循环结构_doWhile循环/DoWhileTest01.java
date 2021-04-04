package A06_循环结构_doWhile循环;
/*
do-while循环的使用

一、循环结构的4个要素
① 初始化条件
② 循环条件  --->是boolean类型
③ 循环体
④ 迭代条件

二、do-while循环结构：

①
do{
	③;
	④;

}while(②);

执行过程：① - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1.do-while循环至少会执行一次循环体！
2.开发中，使用for和while更多一些。较少使用do-while

*/
public class DoWhileTest01 {
    public static void main(String[] args) {
        //遍历100以内的偶数,并计算所有偶数的和及偶数的个数
        int sum = 0;
        int count = 0;

        int i = 1;
        do {
            if (i % 2 == 0) {
                sum = sum + i;
                count += 1;
                System.out.println(i);
            }
            i ++;
        }while (i <= 100);

        System.out.println(sum);
        System.out.println(count);
    }
}
