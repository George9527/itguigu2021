package A01_数据引用类型的值传递;
/*
    查看基本数据类型的值在传递过程中的变化
 */
public class editValueDemo {

    public static void main(String[] args) {

        //  自定义一个变量
        int num = 5;

        // 创建value对象
        value v = new value();

        System.out.println("调用方法前的值：" + num);

        // 调用方法
        v.editValue(num);

        System.out.println("调用方法后的值：" + num);

        // 定义一个变量接收调用方法处理后的值
        int res = v.editValue(num);
        // 输出方法处理后的结果
        System.out.println("方法处理后的结果:" + res);
    }

}
