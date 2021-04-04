package E08_方法的参数传递;

/*
    对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
 */

public class ArgsDemo01 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法后：" + number);

        String name = "小红";
        System.out.println(name);
        nameString(name);
        System.out.println(name);
    }

    // 引用数据类型 --- 数组
    public static void change(int number) {
        number = 200;
        System.out.println("change方法的值 ：" + number);
    }

    // 引用数据类型 --- String
    public static void nameString(String userName) {
        userName = "小明";
        System.out.println("String类中的值 ：" + userName);
    }
}
