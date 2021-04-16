package A05_自动装箱和拆箱中的问题;

/**
 * 自动装箱和拆箱中的问题
 */

public class auto02 {
    public static void main(String[] args) {

        Integer i1 = 1000; //new Integer(1000)
        Integer i2 = 1000; //new Integer(1000)
        System.out.println("i1==i2::" + (i1 == i2) ); // F
        System.out.println(i1.equals(i2)); // T

        System.out.println("=====忧郁的分割线======");

        Integer i3 = 1;
        Integer i4 = new Integer(1);
        System.out.println("i3==i4::"+(i3 == i4));// F
        System.out.println(i3.equals(i4)); // T

        System.out.println("=====忧郁的分割线======");

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println("i5==i6::"+(i5 == i6)); //true  数据不要超过byte

    }
}
