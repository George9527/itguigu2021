package B02_文件到集合;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
- 案例需求
  把ArrayList集合中的字符串数据写入到文本文件。
 要求：每一个字符串元素作为文件中的一行数据

- 实现步骤:
  - 创建ArrayList集合
  - 往集合中存储字符串元素
  - 创建字符缓冲输出流对象
  - 遍历集合，得到每一个字符串数据
  - 调用字符缓冲输出流对象的方法写数据
  - 释放资源
 */

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        // 创建ArrayList集合
        ArrayList<String> array = new ArrayList<String>();

        // 往集合中存储字符串元素
        array.add("Hwllo");
        array.add("World");
        array.add("Java");

        // 创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\CopyDemo\\Demo02.txt"));

        // 遍历集合，得到每一个字符串数据
        for (String s : array) {
            // 调用字符缓冲输出流对象的方法写数据
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        bw.close();
    }
}
