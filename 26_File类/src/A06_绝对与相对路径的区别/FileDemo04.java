package A06_绝对与相对路径的区别;

//    绝对路径和相对路径的区别
//        - 绝对路径：完整的路径名，不需要任何其他信息就可以定位它所表示的文件。例如：E:\itcast\java.txt
//        - 相对路径：必须使用取自其他路径名的信息进行解释。例如：myFile\\java.txt

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
    }
}
