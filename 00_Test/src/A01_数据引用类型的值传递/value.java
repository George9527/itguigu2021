package A01_数据引用类型的值传递;

public class value {

    // 定义一个方法 ，接收变量并修改
    public int editValue(int num) {
        System.out.println("调用方法修改前的值：" + num);
        // 修改接收的变量后输出
        num += num + 5;
        System.out.println("调用方法修改后的值：" + num);
        return num;
    }
}
