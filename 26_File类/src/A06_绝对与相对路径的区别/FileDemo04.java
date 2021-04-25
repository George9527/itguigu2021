package A06_绝对与相对路径的区别;

/*
    绝对路径和相对路径的区别
        - 绝对路径：完整的路径名，不需要任何其他信息就可以定位它所表示的文件。例如：E:\itcast\java.txt
        - 相对路径：必须使用取自其他路径名的信息进行解释。例如：myFile\\java.txt

    绝对路径
        - 在磁盘中的路径具有唯一性
        - Windows系统中,盘符开头 `C:/Java/jdk1.8.0_221/bin/javac.exe`
        - Linux或者Unix系统, /开头,磁盘根 `/usr/local`
    互联网路径 :`www.baidu.com`
        - `https://item.jd.com/100007300763.html`
        - `https://pro.jd.com/mall/active/3WA2zN8wkwc9fL9TxAJXHh5Nj79u/index.html`
    相对路径：
        - 必须有参照物
        - `C:/Java/jdk1.8.0_221/bin/javac.exe`
        - bin是参考点 : 父路径 C:/Java/jdk1.8.0_221
        - bin是参考点 : 子路径 javac.txt
        - bin参考点: 父路径使用 ../表示
 */

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {

        // 新建一个File类使用 绝对路径表示
        System.out.print("绝对路径:");
        File file = new File("E:\\itcast\\java.txt");
        System.out.println(file);

        // 新建一个File类使用 绝对路径表示
        System.out.print("绝对路径:");
        File file1 = new File("myFile\\java.txt");
        System.out.println(file1);

        /**
         * boolean isAbsolute() 判断构造方法中的路径是不是绝对路径
         * 不写绝对形式的路径,写相对形式的,默认在当前的项目路径下
         */

        File file3 = new File("C:/Java/jdk1.8.0_221/bin/javac.exe");
        // 判断此路径名是否为绝对路径
        boolean b = file3.isAbsolute();
        System.out.println("b = " + b);

        File file4 = new File("javac.exe");
        b = file4.isAbsolute();
        System.out.println("b = " + b);
    }
}
