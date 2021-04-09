package A08_接口规则案例;
/**
 *  键盘类 : 满足接口标准
 */
public class KeyBoard implements USB{

    @Override
    public void start() {
        System.out.println("键盘：开始工作");
    }

    @Override
    public void end() {
        System.out.println("键盘：停止工作");
    }
}
