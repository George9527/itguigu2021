package A03_File类判断和获取功能;

import java.io.File;

/*
    判断功能:
        public   boolean isDirectory() --- 测试此抽象路径名表示的File是否为目录
        public   boolean isFile() --- 测试此抽象路径名表示的File是否为文件
        public   boolean   exists() --- 测试此抽象路径名表示的File是否存在

    获取功能:
        public   String getAbsolutePath() --- 返回此抽象路径名的绝对路径名字符串
        public   String getPath() --- 将此抽象路径名转换为路径名字符串
        public   String getName() --- 返回由此抽象路径名表示的文件或目录的名称
        public   String[] list() --- 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        public   File[] listFiles() --- 返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */

public class FileTest01 {
    public static void main(String[] args) {

        File file = new File("D:\\Temp\\IDEA\\reset_script");

        // 获取绝对路径
        File absoluteFile = file.getAbsoluteFile();
        System.out.println("absoluteFile = " + absoluteFile);

        // 获取父路径
        File parentFile = file.getParentFile();
        System.out.println("parentFile = " + parentFile);
        // 获取父路径上一层
        File parentFile2 = file.getParentFile().getParentFile();
        System.out.println("parentFile2 = " + parentFile2);

        // 获取子路径


        // 获取路径的名字
        String name = file.getName();
        System.out.println("File name = " + name);

        // 获取File构造方法中的路径
        String pathName = file.getPath();
        System.out.println("pathName = " + pathName);

        // 获取文件的字节数
        long length = file.length();
        System.out.println("length = " + length);

        //创建一个File对象
        File f = new File("myFile\\java.txt");

//        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
//        public boolean isFile()：测试此抽象路径名表示的File是否为文件
//        public boolean exists()：测试此抽象路径名表示的File是否存在
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

//        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
//        public String getPath()：将此抽象路径名转换为路径名字符串
//        public String getName()：返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("--------");

//        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
//        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File f2 = new File("D:\\Temp");
        // 这里如果没有这个目录会报空指针异常的问题

        String[] strArray = f2.list();
        for(String str : strArray) {
            System.out.println(str);
        }
        System.out.println("--------");

        File[] fileArray = f2.listFiles();
        for(File file2 : fileArray) {
//            System.out.println(file2);
//            System.out.println(file2.getName());
            if(file2.isFile()) {
                System.out.println(file2.getName());
            }
        }
    }
}
