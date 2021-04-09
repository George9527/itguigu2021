package A16_静态方法;

/**
 *  静态方法直接类名调用. 静态方法中不能直接使用非静态成员.
 *
 *   为什么不能调用非静态成员
 *
 * > 静态是先人,非静态是后人. 静态出现在内存的时间早于非静态
 */
public class Person {

    String name;
    static String country = "中国";

    /**
     * 静态方法
     */
    public static void eat(){
        System.out.println("人在吃饭" + country);
//        System.out.println(name); //错误写法,不允许
//        ---不能调用非静态成员
    }
}
