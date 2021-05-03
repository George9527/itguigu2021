package B01_交通信号灯;

public class ColorTest {
    public static void main(String[] args) {
        // 通过枚举 获得 信号灯
        System.out.println("信号灯: " + Color.RED.getColorTag());
        System.out.println("信号灯: " + Color.GREEN.getColorTag());
        System.out.println("信号灯: " + Color.YELLOW.getColorTag());
    }
}
