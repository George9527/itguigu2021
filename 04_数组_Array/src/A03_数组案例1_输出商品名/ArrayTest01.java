package A03_数组案例1_输出商品名;
/*
    数组的使用
        需求：
          ①：在控制台显示五种商品名称
 */
public class ArrayTest01 {
    public static void main(String[] args) {

        // 使用静态方法创建 String类型的数组
        String[] brand = {"背包","衣服","鞋子","外套","腰包"};

        // 下面这个创建方法也是可以的
        String []brand2 = {"背包","衣服","鞋子","外套","腰包"};

        // 使用增强 for 输出
        for (String s : brand) {
            System.out.println(s);
        }
    }
}
