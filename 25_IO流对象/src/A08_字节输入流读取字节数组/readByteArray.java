package A08_字节输入流读取字节数组;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流,读取字节数组
 * int read(byte[] b) 读取字节数组
 * 返回值 : 返回读取到的字节个数
 * String类的构造方法 new String(字节数组,开始索引,转换的个数)
 */

public class readByteArray {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象,绑定数据源文件
        FileInputStream fis = new FileInputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java01.txt");
        byte[] bytes = new byte[50];
        //定义变量,保存read方法的返回值
        int r = 0 ;
        while ( (r=fis.read(bytes)) !=-1){
            System.out.print(new String(bytes,0,r));
        }

        fis.close();
    }
}
