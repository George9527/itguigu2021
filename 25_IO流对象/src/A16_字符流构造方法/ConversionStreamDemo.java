package A16_字符流构造方法;

import java.io.*;

/**
### 为什么会出现字符流【理解】

- 字符流的介绍
  由于字节流操作中文不是特别的方便，所以Java就提供字符流
  字符流 = 字节流 + 编码表

- 中文的字节存储方式

  用字节流复制文本文件时，文本文件也会有中文，但是没有问题，原因是最终底层操作会自动进行字节拼接成中文，如何识别是中文的呢？
  汉字在存储的时候，无论选择哪种编码存储，第一个字节都是负数

 InputStreamReader(InputStream in) --- 使用默认字符编码创建InputStreamReader对象
 InputStreamReader(InputStream in,String chatset) --- 使用指定的字符编码创建InputStreamReader对象
 OutputStreamWriter(OutputStream out) --- 使用默认字符编码创建OutputStreamWriter对象
 OutputStreamWriter(OutputStream out,String charset) --- 使用指定的字符编码创建OutputStreamWriter对象

 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {

        // 使用默认字符编码创建OutputStreamWriter对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"));

        // 使用指定的字符编码创建OutputStreamWriter对象
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"), "GBK");
        osw2.write("测试");
        osw2.close();

        // 使用默认字符编码创建InputStreamReader对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\isr.txt"));

        // 使用指定的字符编码创建InputStreamReader对象
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("myCharStream\\isr.txt"), "GBK");
        //一次读取一个字符数据
        int ch;
        while ((ch = isr2.read()) != -1) {
            System.out.println("ch = " + (char)ch);
        }
        isr2.close();
    }
}
