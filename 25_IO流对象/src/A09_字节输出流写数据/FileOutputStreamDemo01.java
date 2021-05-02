package A09_字节输出流写数据;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * - 字节流抽象基类
 *
 *   - InputStream：这个抽象类是表示字节输入流的所有类的超类
 *   - OutputStream：这个抽象类是表示字节输出流的所有类的超类
 *   - 子类名特点：子类名称都是以其父类名作为子类名的后缀
 *
 * - 字节输出流
 *
 *   - FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
 *
 * - 使用字节输出流写数据的步骤
 *
 *   - 创建字节输出流对象(调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件)
 *   - 调用字节输出流对象的写数据方法
 *   - 释放资源(关闭此文件输出流并释放与此流相关联的任何系统资源)
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        // FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java03.txt");

        /*
            做了三件事情：
                A:调用系统功能创建了文件
                B:创建了字节输出流对象
                C:让字节输出流对象指向创建好的文件
         */

        //void write(int b)：将指定的字节写入此文件输出流
        fos.write(97);
        fos.write(98);
        fos.write(99);

        // 最后都要释放资源
        // void close()：关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos.close();
    }
}
