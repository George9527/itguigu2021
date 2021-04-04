package A11_自加自减运算;
/*
    **理解：**`++`  **运算，变量自己的值加1**。反之，`--` 运算，变量自己的值减少1，用法与`++` 一致。

1、单独使用

* 变量在单独运算的时候，变量`前++`和变量`后++`，变量的是一样的；
* 变量`前++`   ：例如 `++a` 。
* 变量`后++`   ：例如 `a++` 。
 */
public class OperatorDemo01 {
    public static void main(String[] args) {
        //  定义变量
        int i = 10;
        System.out.println("i:>>>" + i);

        //单独使用
        //i++
        ++i;
        System.out.println("i:>>>" + i);

        //参与操作使用
        //int j = i++;
        int j = ++i;
        System.out.println("j:>>>" + j);
    }
}
