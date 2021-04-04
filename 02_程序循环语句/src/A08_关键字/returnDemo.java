package A08_关键字;
/*
    本质上不是控制循环的语句，是用来结束一个函数（方法）的。但是当函数结束时，哪怕还有循环操作没有结束，那也执行不了了。
 */
public class returnDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){

            System.out.println("i="+i);

            if (i == 6){
                return ;
            }

        }

        // 由于整个函数结束了，所以这里的代码不会被执行到
        System.out.println("循环后面的代码");
    }
}
