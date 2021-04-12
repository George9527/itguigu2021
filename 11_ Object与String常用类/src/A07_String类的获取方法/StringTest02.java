package A07_String类的获取方法;

/**
 * > String类的获取方法,返回值不一定
 *
 * - int length() 返回字符串长度,字符串中字符的个数
 * - char charAt(int index) 返回指定索引上的单个字符
 * - int indexOf(String str) 返回指定的字符串,在当前字符串中第一次出现的索引
 * - int lastIndexOf(String str) 返回指定的字符串,在当前字符串中最后一次出现的索引
 * - String substring(int start,int end)截取字符串,参数表示开始索引和结束索引,包含开头索引,不包含结束索引
 */
public class StringTest02 {

    public static void main(String[] args) {

        //int length() 返回字符串长度,字符串中字符的个数
        // 方法一
        String s = "abcdef";
        int i = s.length();
        System.out.println("字符串长度-i = " + i);
        // 方法二
        int i2 = "abcdefgh".length();
        System.out.println("字符串长度-i2 = " + i2);

        //char charAt(int index) 返回指定索引上的单个字符
        String s2 = "abcdef";
        char c = s2.charAt(3);
        System.out.println("c = " + c);

        char ch = "abcdefg".charAt(3);
        System.out.println("ch = " + ch);


        //int indexOf(String str) 返回指定的字符串,在当前字符串中第一次出现的索引
        //找不到指定的字符串,返回-1  负数不能作为索引出现
        int indexof = "abcdef".indexOf('a');
        System.out.println("indexof = " + indexof);

        String s3 = "abcdef";
        int indexof2 = s3.indexOf('b');
        System.out.println("indexof2 = " + indexof2);


        //int lastIndexOf(String str) 返回指定的字符串,在当前字符串中最后一次出现的索引
        int test = "abcddeee".lastIndexOf("b");
        System.out.println("test = " + test);

        String s4 = "abcdedf";
        int test2 = s4.lastIndexOf('d');
        System.out.println("test2 = " + test2);


        //String substring(int start,int end)截取字符串,参数表示开始索引和结束索引,
        // 包含开头索引,不包含结束索引
        String str = "HelloWorld";
        str =  str.substring(2,6);// 返回新的字符串
        System.out.println("str = " + str);

        //substring具有重载写法
        String str1 = "你好我好大家好";
        str1 = str1.substring(3);//从3索引开始,截取到最后
        System.out.println("str1 = " + str1);

    }
}
