package A14_逻辑运算符;

/*
    逻辑运算符
 */
public class LogicDemo07 {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        // & 与() 有false则false
        System.out.println((i > j) & (i > k)); //false & false = false
        System.out.println((i < j) & (i > k)); //true & false = false
        System.out.println((i > j) & (i < k)); //false & true = false
        System.out.println((i < j) & (i < k)); //true & true = true
        System.out.println("--------");

        // | 或() 有true则true
        System.out.println((i > j) | (i > k)); //false | false = false
        System.out.println((i < j) | (i > k)); //true | false = true
        System.out.println((i > j) | (i < k)); //false | true = true
        System.out.println((i < j) | (i < k)); //true | true = true
        System.out.println("--------");

        // ^ 异或() 相同为false，不同为true
        System.out.println((i > j) ^ (i > k)); //false ^ false = false
        System.out.println((i < j) ^ (i > k)); //true ^ false = true
        System.out.println((i > j) ^ (i < k)); //false ^ true = true
        System.out.println((i < j) ^ (i < k)); //true ^ true = false
        System.out.println("--------");

        // ! 非() 结果取反
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false =  true
        System.out.println(!!(i > j)); //!!false = i(!false) = i(true) = flase
        System.out.println(!!!(i > j)); //!!!false = ... i(flase) = true
    }
}
