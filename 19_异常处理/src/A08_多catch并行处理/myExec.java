package A08_多catch并行处理;
/**
 *   myExec出现2个异常
 *   写2个catch分别捕获异常
 *
 *   多个catch处理异常的时候,写法特别注意 :
 *      如果catch中的异常类没有关系,先写后写没有区别, catch中的异常类有继承关系,**父类写在最下面**
 */
public class myExec {
    public static void main(String[] args) {
        try {
            myExec(1);
        }catch (NullPointerException ex){
            System.out.println("处理空指针异常");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("处理越界异常");
        }
    }

    /**
     * 定义方法,目的引发异常
     * 传递参数 : 对参数进行判断
     */
    public static void  myExec(int i) {
        if (i == 0) {
            //引发空指针异常
            String s = null;
            int len = s.length();
        } else {
            //引发越界异常
            int[] arr = {};
            int a = arr[0];
        }
    }
}

