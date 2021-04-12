package A10_String类正则表达式;

/*
    String类的方法replaceAll
 */

public class StringDemo02 {
    public static void main(String[] args) {
        String str = "as123d387654w5465fasfr234567sa";
        //字符串中的所有数组,换成#
        String repString = str.replaceAll("\\d+","#");
        System.out.println(repString);

        String first =  str.replaceFirst("\\d+","#");
        System.out.println(first);
    }
}
