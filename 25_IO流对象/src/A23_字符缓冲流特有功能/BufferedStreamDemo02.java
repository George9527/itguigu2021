package A23_字符缓冲流特有功能;

import java.io.*;

/**
BufferedWriter：
    void newLine() --- 写一行分隔符，行分隔符字符串由系统属性定义

BufferedReader:
    String readLine() ---  读一行文字。 结果包含行的内容的字符串，
                     不包括任何行终止字符如果流的结尾已经到达，则为null
 */

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {

        //创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));

        //写数据
        for (int i = 0; i < 10; i++) {
            bw.write("hello" + i);
            //bw.write("\r\n"); // 手动添加转义符 -- 隔行符
            bw.newLine();
            bw.flush();
        }

        //创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));

        //读数据
        String line;
        // 不包括任何行终止字符如果流的结尾已经到达，则为null
        while ((line = br.readLine()) != null) {
            System.out.println("line = " + line);
        }

        // 释放资源
        br.close();
    }
}
