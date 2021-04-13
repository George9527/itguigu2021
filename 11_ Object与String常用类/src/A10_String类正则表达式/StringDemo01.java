package A10_String类正则表达式;
/*
    String类的方法split
        String类中正则表达式的切割方法
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String str = "as123d387654w5465fasfr234567sa";
        String[] strings = str.split("\\d+");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("================");
        String ip = "192.....168.....35.121";
        String[] ipArray = ip.split("\\.+");
        for (int i = 0; i < ipArray.length; i++) {
            System.out.println(ipArray[i]);
        }
    }
}
