package A09_字符串去空格;

/*
    去掉字符串两边的空格

   "  abcd  efg     " ==>"abcd  efg"
 */
public class myTrim {
    public static void main(String[] args) {

        // 原字符串开头与结尾均包含空格
        String str = "  abcd  efg     ";
        System.out.println("str = " + str);
        System.out.println(str.length());

        // 去掉字符串开头的空格,方法替换 --- 替换掉开头的空格
        str = str.replaceFirst(" ", "");

        System.out.println(" ");
        System.out.println("str = " + str);
        System.out.println(str.length());

        // 判断字符串,是不是以空格结尾
        while (str.endsWith(" ")) { //"abcde  fg1"
            //截取字符串 ---
            // 用while循环不断截取最后一个字符，
            // 直到 endsWith()false，表示不是以空格结尾才结束
            str = str.substring(0, str.length() - 1);
        }

        System.out.println(" ");
        System.out.println("str = " + str);
        System.out.println(str.length());

    }
}
