package A02_遍历文件目录;

/*
    案例需求:
        给定一个路径
        通过递归完成遍历该目录下所有内容，
        并把所有文件的绝对路径输出在控制台
 */

import java.io.File;

public class FileDemo05 {
    public static void main(String[] args) {
        //根据给定的路径创建一个File对象
//        File srcFile = new File("E:\\itcast");
        File srcFile = new File("D:\\Project\\Java\\SGG2021\\26_File类\\src");

        //调用方法
        getAllFilePath(srcFile);
    }

    //定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
    public static void getAllFilePath(File srcFile) {
        //获取给定的File目录下所有的文件或者目录的File数组
        File[] fileArray = srcFile.listFiles();
        //遍历该File数组，得到每一个File对象
        if(fileArray != null) {
            for(File file : fileArray) {
                //判断该File对象是否是目录
                if(file.isDirectory()) {
                    //是：递归调用
                    getAllFilePath(file);
                } else {
                    //不是：获取绝对路径输出在控制台
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
