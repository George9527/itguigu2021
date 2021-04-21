package A11_throw和throws关键字的使用;

/*
### throw和throws 关键字的使用

- throw关键字 : 只能写在方法内部, 关键字的后面跟随对象的创建
- throws关键字 : 只能写在方法的定义上,关键字后面跟随异常类名
 */
public class ThrowOrThrowsDemo {

    public static void main(String[] args) {

        /**
         *   getArea()调用方法,方法上有异常
         *   只能处理,不处理编译失败
         *   在main的方法上加throws 异常没有处理,交给JVM处理
         *   try catch处理
         */

        try {
            int area = getArea(10);
            System.out.println("area = " + area);
        } catch (Exception error) {
            error.printStackTrace();
        }

        // 如果不对输入数值进行判断，当输入负数的时候，
        // 程序会报错，但是在编译过程中不会报错

    }

    /**
     * 功能: 计算正方形的面积
     * 需要参数 : 边长
     * 语法 : 方法的内部出现了异常,必须在方法定义上暴露
     */
    public static int getArea(int length) throws Exception {
        if (length <= 0)
            //数据错误,导致后面的计算不能进行
            //内部出现问题
            throw new Exception("边长不存在");
        return length * length;
    }
}
