package B01_集合到文件;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;

/**
- 案例需求:
    把文本文件中的数据读取到集合中，并遍历集合。
    要求：文件中每一行数据是一个集合元素

- 实现步骤:
  - 创建字符缓冲输入流对象
  - 创建ArrayList集合对象
  - 调用字符缓冲输入流对象的方法读数据
  - 把读取到的字符串数据存储到集合中
  - 释放资源
  - 遍历集合
 */

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        // BufferedReader(Reader in) --- 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\CopyDemo\\Demo01.txt"));

        // 创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<>();

        // 调用字符缓冲输入流对象的方法读数据
        /*
        BufferedReader:
            String readLine() ---  读一行文字。 结果包含行的内容的字符串，
                                    不包括任何行终止字符如果流的结尾已经到达，则为null
         */
        String line;
        while ((line = br.readLine()) != null) {
            // 把读取到的字符串数据存储到集合中
            array.add(line);
        }

        // 释放资源
        br.close();

        // 遍历集合
        for (String s : array) {
            System.out.println(s);
        }
    }
}
