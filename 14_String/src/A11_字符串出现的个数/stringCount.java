package A11_字符串出现的个数;

/*
### 1.1 字符串出现的次数

  字符串A,另一个字符串B,计算B字符串在A字符串中出现几次

  例子 :  dsabdnabdsnabeabiwpabekabd   **ab**

- 实现过程
  - 对字符串进行索引查找 indexOf
  - 找到的字符串的索引记录,进行字符串的截取
  - 直到找打到未知, indexOf方法是-1
  - 一旦找到了,计数器++
 */
public class stringCount {
    public static void main(String[] args) {
        // 定义一个字符串
        String str = "dsabdnabdsnabeabiwpabekabd";
        // 定义需要查找的字符串
        String sub = "ab";
        //定义变量,计数器
        int count = 0;
        //定义变量,记录字符串查找后的索引
        int index = 0;

        //对字符串出现的位置,进行查询
        //反复查找,使用循环while
        //循环条件就是indexOf方法返回-1
        while ((index = str.indexOf(sub)) != -1) {
            //执行了循环index !=-1 字符串出现了
            count++;
            //截取字符串,开始索引 index+被查找字符串的长度
            str = str.substring(index + sub.length());
        }

        System.out.println("字符串：" + sub + "  出现了：" + count);
    }
}
