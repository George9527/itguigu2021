package A13_字节流复制文本文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
### 字节流复制文本文件【应用】

- 案例需求
  ​	把“E:\\itcast\\窗里窗外.txt”复制到模块目录下的“窗里窗外.txt”

- 实现步骤
  - 复制文本文件，其实就把文本文件的内容从一个文件中读取出来(数据源)，然后写入到另一个文件中(目的地)
  - 数据源：
    ​	E:\\itcast\\窗里窗外.txt --- 读数据 --- InputStream --- FileInputStream
  - 目的地：
    ​	myByteStream\\窗里窗外.txt --- 写数据 --- OutputStream --- FileOutputStream

 */
public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        // 根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\窗里窗外.txt");

        // 根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\CopyDemo\\窗里窗外.txt");

        // 读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        int by;
        while ((by=fis.read())!=-1) {
            fos.write(by);
        }

        //释放资源
        fos.close();
        fis.close();

        // 小结：这是一种伪需求，文件的读 与 写 的编码方法都是不一样的
        // 这样读取是错误的，实际情况中这样的绝对不能做的。
        // 仅作为方法使用的案例
    }
}
