package A01_对象的序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
对象的序列化的意义 :
    对象变成一个文件,在网络中传递,可以让任何一个人使用
 ObjectOutputStream 对象的序列化:
 - 构造方法:
    ObjectOutputStream(OutputStream out) --- 传递字节输出流
    void writeObject(Object o) --- 写入对象
 */

public class writeObj {
    public static void main(String[] args) throws IOException {
        //创建字节输出流,绑定文件
        FileOutputStream fos = new FileOutputStream("day20_2/person.txt");
        //对象的序列化流创建
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //oos流,写入对象
        Person person = new Person("张三",20);
        oos.writeObject(person);
        oos.close();
    }
}
