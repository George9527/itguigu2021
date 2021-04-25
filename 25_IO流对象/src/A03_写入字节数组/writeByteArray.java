package A03_写入字节数组;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写入字节数组
 */

public class writeByteArray {
    public static void main(String[] args) {
        // 调用方法
        try {
            new writeByteArray().writeByteArrayDemo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeByteArrayDemo() throws IOException {
        //创建字节输出流对象,构造方法中,绑定文件路径,写入目的
        FileOutputStream fos = new FileOutputStream(
                "D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\file\\java01.txt");
        byte[] bytes = {97,98,99,100,101,102};
        //写入字节数组
        fos.write(bytes);
        //写入字节数组中文 --- 写入中文有可能因为编码导致乱码问题
        fos.write("11".getBytes());
        //写入数组一部分
        fos.write(bytes,1,3);
        //释放资源
        fos.close();
    }

}
