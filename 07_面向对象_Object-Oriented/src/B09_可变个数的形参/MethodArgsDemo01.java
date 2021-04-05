package B09_可变个数的形参;
/*
    可变个数形参的方法
    1.jdk 5.0 新增的内容
    2.具体使用
        2.1 可变个数形参的格式： 数据类型。。。 变量名。。。
        2.2 当调用可便个数形参的方法时，传入的参数个数可以是：0个、1个、2个。。。。。
        2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
        2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组不构成重载(二者不能共存)
        2.5 可变个数形参在方法的形参中，必须声明在末尾
        2.6 可变个数形参在方法的形参中，最大只能声明一个可变形参

 */
public class MethodArgsDemo01 {

    public static void main(String[] args) {
        MethodArgsDemo01 test = new MethodArgsDemo01();
        test.show("Hello");
        test.show("Hello","World");
        test.show("Hello","World","Java");
        // test.show("Hello",3); --- 3 不少String类型
        test.show(5,"Hello");
    }
    // 一个数的形参的方法
    public void show(String s) {
        System.out.println(s);
    }

    // 可变个数的形参的方法
    public void show(String...strs) {
        System.out.println("show(String...strs)");
        // 使用遍历 String[] arr 来遍历这个方法
        //以此证明 (String...strs) = (String[] strs)
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    //2.5 可变个数形参在方法的形参中，必须声明在末尾
    public void show(int i, String...strs) {
        System.out.println(i + ": strs");
    }

//    // 2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组不构成重载(二者不能共存)
//    public void show(String[] strs) {
//        System.out.println("错误的方法");
//    }

    // 2.6 可变个数形参在方法的形参中，最大只能声明一个可变形参
//    public void show(int i,double d,String...strs,int...ints) {
//        System.out.println("Test");
//    }

}
