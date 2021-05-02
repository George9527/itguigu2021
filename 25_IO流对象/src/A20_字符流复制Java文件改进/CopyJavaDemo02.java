package A20_字符流复制Java文件改进;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
- 案例需求

  使用便捷流对象，把模块目录下的“ConversionStreamDemo.java” 复制到模块目录下的“Copy.java”

- 实现步骤

  - 根据数据源创建字符输入流对象

  - 根据目的地创建字符输出流对象
  - 读写数据，复制文件
  - 释放资源

 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        FileReader fr = new FileReader("myCharStream\\ConversionStreamDemo.java");

        // 根据目的地创建字符输出流对象
        FileWriter fw = new FileWriter("myCharStream\\Copy.java");

        //读写数据，复制文件
        int ch;
        while ((ch=fr.read())!=-1) {
            fw.write(ch);
        }

        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1) {
            fw.write(chs,0,len);
        }

        //释放资源
        fw.close();
        fr.close();
    }
}
