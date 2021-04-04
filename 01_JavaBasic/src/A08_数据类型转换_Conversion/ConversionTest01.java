package A08_数据类型转换_Conversion;
/*
    基本数据类型之间的运算规则
    前提：这里讨论只是7种基本数据类型变量间的运算，不包含boolean类型

        1.自动类型提升
        结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，
        结果自动提升为容量大的数据类型
        将 取值范围小的类型 自动提升为 取值范围大的类型
        byte、char、short --> shout --> int --> float --> double
        特别的: 当byte、char、short三种类型的变量做运算时，结果为int型

        2.自动类型转换
        3.强制类型转换
          见下一个例子
 */
public class ConversionTest01 {
    public static void main(String[] args) {
        // 自动类型转换
        byte b1 = 10;
        int i1 = 12;

        //有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的
        //那种数据类型，然后再进行计算

        //错误 --- 编译不通过
        //byte b2 = b1 + i1;  // 含有 int 类型 ，自动升格应该用 int 来接收结果

        //正确
        int i2 = b1 + i1;  // 自动升格用 int 来接收结果
        System.out.println(i2);

        //尝试使用浮点型
        float f = b1 + i1;
        System.out.println(f);  // float > int > byte

        double d = b1 + i1;
        System.out.println(d); // double > int > byte

        // ====================
        char c = 'a';
        int i3 = 10;
        int  i4 = i3 + c;
        System.out.println("char:" + i4);
        //结论 char 也是可以的  ---- 97 + 10 = 107
        // 这里的 char c = 'a' ，a会使用ASCII码 变成 97与10进行加法运算

        short s2 = 10;
        //char c2 = c + s2; --- 编译不通过

        byte b2 = 10;
        //char c3 = c + b2; --- 编译不通过
        //short s3 = b2 + s2; --- 编译不通过
        //short s4 = b1 + b2; --- 编译不通过

        //注意下面的例子
        long l = 123321;
        System.out.println(l);
        //属于 自动类型提升
        //小结：123321 这个可以理解为 int类型 --- 这里int自动提升为long 所以不加 【L】也能输出

//        long l2 = 123321123321;
//        System.out.println(l2);
        //小结：这里的 123321123321 已经超出 int型的取值范围 ，必须加上 L 否则会报错
        //编译错误 --- 多大的整数

        //修改后
        long l3 = 123321123321L;
        System.out.println(l3);

        //浮点数 默认为 double 型
        //编译报错：double 比 float 高 强制类型转换要加上F
        float f1 = 12.3F;
        // 这里的 12 为int型 自动提升
        float f2 = 12;

        //2.编码情况2：
        //整型常量，默认类型为int型
        //浮点型常量，默认类型为double型
        byte b = 12;
        //byte b1 = b + 1;//编译失败

        //float f1 = b + 12.3;//编译失败
    }
}