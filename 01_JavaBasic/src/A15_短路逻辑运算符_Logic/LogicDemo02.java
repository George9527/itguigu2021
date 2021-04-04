package A15_短路逻辑运算符_Logic;
/*
    短路逻辑运算符
 */
public class LogicDemo02 {
    public static void main(String [] args) {
        //  定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        // &&    有false则false
        System.out.println(i > j && i > k);  //false && fales
        System.out.println(i < j && i > k);  //true && fales
        System.out.println(i > j && i < k);  //false && true
        System.out.println(i < j && i < k);  //true && true
        System.out.println("------------");

        // ||    有true则true
        System.out.println(i > j || i > k);  //false || fales
        System.out.println(i < j || i > k);  //true || fales
        System.out.println(i > j || i < k);  //false || true
        System.out.println(i < j || i < k);  //true || true
        System.out.println("------------");

        //System.out.println((i++ > 100) & (j++ > 100));  //false & false
        System.out.println((i++ > 100) && (j++ > 100));  //false && false

        System.out.println("i:>>>" + i);  //判断左边为False 故 右边不执行。输出为 i++ 值为11
        System.out.println("j:>>>" + j);  //j++不执行。输出为 j++ 的值为20，没有变化

        //区分& 与 &&
        //相同点1：& 与  && 的运算结果相同
        //相同点2：当符号左边是true时，二者都会执行符号右边的运算
        //不同点：当符号左边是false时，&继续执行符号右边的运算。&&不再执行符号右边的运算。
        //开发中，推荐使用&&
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }

        System.out.println("num1 = " + num1);


        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }

        System.out.println("num2 = " + num2);

        // 区分：| 与 ||
        //相同点1：| 与  || 的运算结果相同
        //相同点2：当符号左边是false时，二者都会执行符号右边的运算
        //不同点3：当符号左边是true时，|继续执行符号右边的运算，而||不再执行符号右边的运算
        //开发中，推荐使用||
        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if(b3 | (num3++ > 0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num3 = " + num3);


        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num4 = " + num4);
    }
}
