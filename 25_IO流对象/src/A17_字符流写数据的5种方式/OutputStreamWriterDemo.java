package A17_字符流写数据的5种方式;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
void   write(int c) --- 写一个字符
void   write(char[] cbuf) --- 写入一个字符数组
void write(char[] cbuf, int off, int len) --- 写入字符数组的一部分
void write(String str) --- 写一个字符串
void write(String str, int off, int len) --- 写一个字符串的一部分

刷新和关闭的方法：
    flush() -- 刷新流，之后还可以继续写数据
    close() --- 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据

 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter ous = new OutputStreamWriter(new FileOutputStream("myCharStream\\\\osw.txt"));

        // void write(int c)：写一个字符
        ous.write(97);

        // void writ(char[] cbuf)：写入一个字符数组
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
        ous.write(chs);

        // void write(char[] cbuf, int off, int len)：
        // 写入字符数组的一部分
        ous.write(chs,1,3);
        ous.write(chs,0,chs.length);

        // void write(String str)：写一个字符串
        ous.write("Java");

        // void write(String str, int off, int len)：
        // 写一个字符串的一部分
        ous.write("Java",0,3);
        ous.write("Java",0,"Java".length());

        //释放资源
        ous.close();
    }
}
