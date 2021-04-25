package A06_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 java.io.InputStream是所有字节输入流的超类 : 可以读取任何类型文件
    读取字节的方法 read()
        - int read() 读取单个字节, 读取到流的末尾返回 -1
        - int read(byte[] b)读取字节数组 , 读取到流的末尾返回 -1

    FileInputStream
        - 构造方法 :  FileInputStream(File file)
        - 构造方法 :  FileInputStream(String file)
        - 创建字节输入流对象,绑定参数就是要读取的数据源文件
*/
public class FileInputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //创建字节输入流对象,绑定数据源文件
        FileInputStream fis = new FileInputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java.txt");
        System.out.println(fis);

        File file = new File("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println(fileInputStream);

    }
}
