package A09_String类的去空替换切割;

/*
    > String类的方法 去空格,替换,切割

- String trim() 去掉字符串两边空格,中间空格不去掉
- String replace(String oldString,String newString)替换字符串
- String[] split("规则字符串") 对字符串进行切割

 */

public class StringTest05 {
    public static void main(String[] args) {

        //String trim() 去掉字符串两边空格,中间空格不去掉
        String str = "  abc  def       ";
        System.out.println(str);
        str = str.trim(); // 调用方法
        System.out.println("str = " + str);

        //String[] split("规则字符串") 对字符串进行切割
        String splitStr = "aa,bb,cc,dd,ee"; // 使用逗号,进行切割
        String[] strs = splitStr.split(",");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        //String replace(String oldString,String newString)替换字符串
        String repStr = "how do you do";
        repStr = repStr.replace("o","N");
        System.out.println("repStr = " + repStr);

    }
}
