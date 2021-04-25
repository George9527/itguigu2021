package A02_写入单个字节;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写入单个字节
 * new FileOutputStream("c:/1.txt"); 文件没有就创建,有了就覆盖
 */

public class writeByte {
    public static void main(String[] args) throws IOException {
        // 调用方法
        try {
            writeByte();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeByte() throws IOException {
        // 创建字节输出流对象,构造方法中,绑定文件路径,写入字节
        FileOutputStream file = new FileOutputStream("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java.txt");
        // 写入单个字节
        file.write(97);
        file.write(98);
        file.write(99);
        file.write(100);
        file.write(101);
        //释放资源
        file.close();
    }
}
