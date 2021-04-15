package A10_字符串翻转;

/**
 * 翻转字符串
 * 传递字符串,返回翻转后的字符串
 */

public class stringReverse {
    public static void main(String[] args) {
        String str = "abcdefg";

        //字符串转成数组
        char[] chars = str.toCharArray();

        //翻转数组
        for(int min = 0 ,max = chars.length - 1; min <= max ; max--,min++){
            char temp = chars[min];
            chars[min] = chars[max];
            chars[max] = temp;
        }
        //数组转成字符串
        String newStr =  new String(chars);

        // 输出结果
        System.out.println("newStr = " + newStr);

    }
}
