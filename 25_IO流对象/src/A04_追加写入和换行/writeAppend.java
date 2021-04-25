package A04_追加写入和换行;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *追加写入和换行:
 * - 追加写入, FileOutputStream构造方法的第二个参数写true
 * - 换行写入, 使用Windows系统的换行符号 \r\n
 */

public class writeAppend {
    public static void main(String[] args) {

        try {
            writeAppend();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeAppend()throws IOException {
        //创建字节输出流对象,构造方法中,绑定文件路径,写入目的
        FileOutputStream fos = new FileOutputStream("c:/1.txt",true);
        fos.write(65);
        //写入换行符号
        fos.write("\r\n".getBytes());
        fos.write(66);
        //释放资源
        fos.close();
    }
}
