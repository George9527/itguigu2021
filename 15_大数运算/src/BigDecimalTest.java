import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("3.55");
        BigDecimal b2 = new BigDecimal("2.12");
       /* System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));*/

        //b1 / b2
        /**
         * 1.674528301886792
         * 除不尽,出现异常
         * 高精度运算,不能产生无序循环小数,无限不循环
         * 保留几位,怎么保留
         *
         *
         * BigDecimal.ROUND_UP  向上+1
         * BigDecimal.ROUND_DOWN 直接舍去
         * BigDecimal.ROUND_HALF_UP 四舍五入
         */
        BigDecimal divide = b1.divide(b2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println("divide = " + divide);
    }
}
