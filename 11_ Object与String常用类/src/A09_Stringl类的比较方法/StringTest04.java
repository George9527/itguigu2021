package A09_Stringl类的比较方法;

/*
    > String类的比较方法

int compareTo(String str) 字符串之间的比较,谁大谁小,按照字典顺序(自然顺序)

 */
public class StringTest04 {

    public static void main(String[] args) {

        //int compareTo(String str) 字符串之间的比较,谁大谁小,按照字典顺序(自然顺序) ASCII码
        String str1 = "bbc";
//        String str2 = "abc";
        String str2 = "abcafasfafasfsf";
        //对象str1调用方法compareTo,参数传递str2
        // 第一个字符与第一个字符比较，字符逐对比较，有结果后,还有的则不再比较

        /**
         *  返回值是int
         *  返回的是 负数,调用者小
         *  返回的是 正数,调用者大
         *  返回是0  一样大
         */

        int i = str1.compareTo(str2);
        System.out.println("i = " + i);
    }

}
