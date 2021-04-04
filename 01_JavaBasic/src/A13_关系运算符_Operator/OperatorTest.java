package A13_关系运算符_Operator;
/*
    练习题
 */
public class OperatorTest {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 0;
        boolean flag = false;
        if(flag=true){
            c = a++ + b;
        }

        if(flag=false){
            c = ++a - b;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
