package A11_字节流写数据实现追加写入;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * - 字节流写数据如何实现换行
 *
 *   - windows:\r\n
 *   - linux:\n
 *   - mac:\r
 *
 * - 字节流写数据如何实现追加写入
 *
 *   - public FileOutputStream(String name,boolean append)
 *   - 创建文件输出流以指定的名称写入文件。
 *      如果第二个参数为true ，则字节将写入文件的末尾而不是开头
 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {

        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java05.txt");

        //创建字节输出流对象
        FileOutputStream fos2 = new FileOutputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java05.txt",true);

        //写数据
//        void   write(byte[] b, int off, int len)
// *          --- 将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流 一次写一个字节数组的部分数据

        for (int i = 0; i <= 10; i++) {
            fos.write("Hwllo".getBytes());
            // 实现换行
            fos.write("\r\n".getBytes());
        }

        //释放资源
        fos.close();

    }
}
