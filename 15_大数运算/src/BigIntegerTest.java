import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        //创建大数据运算对象
        BigInteger b1 = new BigInteger("2345673456786554678996546754434343244568435678986");
        BigInteger b2 = new BigInteger("8765432345678987654323456787654");

        //b1+b2 求和
        BigInteger add = b1.add(b2);
        System.out.println("add = " + add);

        //b1 - b2 求差
        BigInteger subtract = b1.subtract(b2);
        System.out.println("subtract = " + subtract);

        //b1 * b2 求积
        BigInteger multiply = b1.multiply(b2);
        System.out.println("multiply = " + multiply);

        //b1 / b2 求商
        BigInteger divide = b1.divide(b2);
        System.out.println("divide = " + divide);
    }
}