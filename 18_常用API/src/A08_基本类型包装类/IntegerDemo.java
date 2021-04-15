package A08_基本类型包装类;
/*
    基本类型包装类
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //需求：需要判断一个数据是否在 int 范围内
        //public static final int MIN_VALUE
        //public static final int MAX_VALUE
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int num = 2147483647;

        if (num >= Integer.MIN_VALUE & num <= Integer.MAX_VALUE) {
            System.out.println("This is numbr!!");
        } else {
            System.out.println("NO");
        }
    }
}
