package A18_字符流读数据的2种方式;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
int read() --- 一次读一个字符数据
int read(char[] cbuf) --- 一次读一个字符数组数据
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\ConversionStreamDemo.java"));

        // int read() --- 一次读一个字符数据
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }

        // int read(char[] cbuf) --- 一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        //释放资源
        isr.close();
    }
}
