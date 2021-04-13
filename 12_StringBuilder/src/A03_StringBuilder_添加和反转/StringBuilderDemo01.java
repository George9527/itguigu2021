package A03_StringBuilder_添加和反转;

/*
    StringBuilder 的添加和反转方法
        public StringBuilder append(任意类型)：添加数据，并返回对象本身
        public StringBuilder reverse()：返回相反的字符序列
 */

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();

        //public StringBuilder append(任意类型)：添加数据，并返回对象本身
        StringBuilder sb2 = sb.append("Hello");

        System.out.println("SB:" + sb);
        System.out.println("SB2:" + sb2);
        System.out.println(sb == sb2);
        System.out.println("重新赋值后SB:" + sb);

        sb.append("hello");
        sb.append("world");
        sb.append("java");
        sb.append(100);
        System.out.println("SB:" + sb);

        //链式编程
        sb.append("hello ").append("world ").append("!!!");
        System.out.println("SB:" + sb);

        //public StringBuilder reverse()：返回相反的字符序列
        sb.reverse();
        System.out.println("SB:" + sb);
    }
}
