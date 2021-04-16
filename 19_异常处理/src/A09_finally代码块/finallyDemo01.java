package A09_finally代码块;

/*
     finally代码块跟随try ... catch使用,也有跟随try使用

  finally代码块里面的程序,无论是否出现异常,都会执行,必须执行

  结束JVM了,finally不执行.

  **主要用于释放资源**
 */
public class finallyDemo01 {
    public static void main(String[] args) {

        try {
            int[] arr = {1};
            System.out.println(arr[0]);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            //后期用于资源的释放
            System.out.println("这里的代码,必须执行");
            System.out.println("不管中间是否出现异常信息");
        }

    }
}
