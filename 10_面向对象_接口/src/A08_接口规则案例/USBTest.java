package A08_接口规则案例;

/**
 * 创建笔记本对象
 * 调用笔记本方法
 * 测试鼠标键盘
 */
public class USBTest {

    public static void main(String[] args) {

        // 创建笔记本对象
        Computer computer = new Computer();

        // 调用笔记本方法,传递鼠标对象 (USB接口实现类对象)
        computer.useUSB(new Mouse());

        // 调用笔记本方法,传递键盘对象 (USB接口实现类对象)
        // 创建一个键盘对象，传递给笔记本方法
        KeyBoard keyBoard = new KeyBoard();
        computer.useUSB(keyBoard);
    }
}
