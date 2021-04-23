package A02_File类创建方法;

import java.io.File;
import java.io.IOException;

/*
    File类的创建方法：
        public boolean createNewFile() --- 当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
        public boolean mkdir() --- 创建由此抽象路径名命名的目录
        public boolean mkdirs() --- 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        // 需求1：我要在目录下创建一个文件java.txt
        File f1 = new File("D:\\Project\\Java\\SGG2021\\26_File类\\src\\file\\java.txt");
        System.out.println(f1.createNewFile()); // 返回创建结果
        // 小结：这里的目录地址必须是真实存在的

        //需求2：我要在目录下创建一个目录JavaSE
        File f2 = new File("D:\\Project\\Java\\SGG2021\\26_File类\\src\\file\\JavaSE");
        System.out.println(f2.mkdir()); // true

        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("D:\\Project\\Java\\SGG2021\\26_File类\\src\\file\\JavaSE\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());

    }
}
