package A07_字节输入流读取单个字节;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流,读取单个字节
 * int read() 读取单个字节
 */

public class readByte {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象,绑定数据源文件
        FileInputStream fis = new FileInputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java.txt");
        //读取单个的字节

        /*
            fis.read()：读数据
            by=fis.read()：把读取到的数据赋值给by
            by != -1：判断读取到的数据是否是-1
         */

        //循环读取,条件 read()!=-1就行
        int r = 0;
        while ((r = fis.read()) != -1) {
            System.out.print((char) r);
        }
        //释放资源
        fis.close();
    }
}
