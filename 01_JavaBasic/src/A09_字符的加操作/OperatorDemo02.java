package A09_字符的加操作;

/*
    字符的 “+” 操作
 */
public class OperatorDemo02 {
    public static void main(String[] args) {
        // 定义两个变量
        int i = 10;
        char c = 'A';
        // char c = 'a';

        // 这里的大小写分别对应ASCII码的65与87

        // a 与 c 的ASCII值进行了加法运算
        System.out.println(i + c);

        //Char 类型会被自动提升为int类型
        int j = i + c;
        System.out.println(j);

        //int k = 10 + 13.14
        //错误double类型比int类型高级，需要升格
        double d = 10 + 13.14;
        System.out.println(d);

    }
}
