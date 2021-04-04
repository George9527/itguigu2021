package A16_三元运算;
/*
	两只老虎

	需求：
		动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
		请用程序实现判断两只老虎的体重是否相同。
*/
public class OperatorTest01 {
    public static void main(String[] args) {
        //定义两个老虎的变量
        int tiger1 = 180;
        int tiger2 = 200;

        //2：用三元运算符实现老虎体重的判断，体重相同，返回true，否则，返回false。
        boolean weight_max = tiger1 > tiger2 ? true : false;

        //输出结果
        System.out.println(weight_max);
    }
}
