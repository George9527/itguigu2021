package A07_For嵌套循环;

/*
    九九乘法表
        小结：换行的空格或者[\t] 会对输出结果造成影响
 */
public class ForForTest02_输出四种九九乘法表 {
    public static void main(String[] args) {

        // 调用左上角方法
        leftTop();

        // 调用左下角方法
        leftBottom();

        // 调用右上角方法
        rightTop();

        // 调用右下角方法
        rightBottom();

        // 调用倒三角形方法
//        upSide();

        // 调用正三角形方法
        topSide();
        upSide();
    }

    // 倒三角形方法
    public static  void upSide() {
        for(int i = 1;i <= 9; i++) {
            // 控制换行后空格间距
            for(int j = i ; j > 1 ; j--) {
                System.out.print("\t");
            }

            for(int j = i;j <= 9 ;j++){
                System.out.print(i + "*" + j + "=" + j*i + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    // 正三角形方法
    public static void topSide() {
        for (int i = 9; i >= 1; i--) {
            // 控制换行后空格间距
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }

            for (int j = i; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + j * i + "\t");
            }
            System.out.println();
        }
//        System.out.println(" ");
    }

    // 左上角方法
    public static void leftTop() {
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    // 左下角方法
    public static void leftBottom() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    // 右上角方法
    public static void rightTop() {
        for(int i = 1;i <= 9; i++) {
            // 控制换行后空格间距
            for(int j = i ; j > 1 ; j--) {
                System.out.print("\t\t");
            }

            for(int j = i;j <= 9 ;j++){
                System.out.print(i + "*" + j + "=" + j*i + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    // 右下角方法
    public static void rightBottom() {
        for (int i = 9; i >= 1; i--) {
            // 控制换行后空格间距
            for (int j = i; j > 1; j--) {
                System.out.print("\t\t");
            }

            for (int j = i; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + j * i + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}
