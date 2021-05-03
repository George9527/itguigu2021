package A01_枚举的概述;

/**
枚举的概述:
    枚举是 Java 中一种特殊的类，它可以定义固定数量的枚举实例，
    例如: 性别、交通信号灯、季节等等

 为什么要使用枚举:
     假设我们要定义一个人类，人类中包含姓名和性别。
     通常会将性别定义成字符串类型

 不使用枚举存在的问题：
     可以给性别传入任意的字符串，
     导致性别是非法的数据，不安全。

 作用：
    一个方法接收的参数是固定范围之内的时候，那么即可使用枚举类型

 格式：
     enum 枚举名 {
        第一行都是罗列枚举实例,这些枚举实例直接写大写名字即可。
     }
 */
public class Demo01 {
    public static void main(String[] args) {
        // 创建Person对象
//        Person p1 = new Person("小明", "男");
//        Person p2 = new Person("小红", "女");

        // 利用枚举的方法
        Person p1 = new Person("张三",Gender.MALE);
        Person p2 = new Person("张三",Gender.FEMALE);

        // 枚举中输入错误的例子
//        Person p3 = new Person("小李", "释放"); // 性别中定义了 只有两种选择

        // 不使用枚举存在的问题：
        // 可以给性别传入任意的字符串，导致性别是非法的数据
        // 例如：性别 只有 男与女，不做约束，能输入任何字符串
        // 使用判断语法处理过于麻烦

//        Person p3 = new Person("小李", "任意");

        System.out.println("姓名：" + p1.getName() +
                " 性别: " + p1.getGender());

        System.out.println("姓名：" + p2.getName() +
                " 性别: " + p2.getGender());
    }
}
