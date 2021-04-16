package A08_多catch并行处理;
/**
 *   myExec出现2个异常
 *   写2个catch分别捕获异常
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

