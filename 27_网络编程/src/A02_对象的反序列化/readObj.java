package A02_对象的反序列化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
## ObjectInputStream 对象的反序列化

- 构造方法ObjectInputStream (InputStream out)传递字节输入流
- Object readObject()读取对象

 */
public class readObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 对象的反序列化
         * ois.readObject(); 类找不到异常 ClassNotFoundException
         * 没有class文件,抛出类找不到异常
         */


        //创建字节输入流,读取数据源文件 ,源文件必须是序列化后的文件
        FileInputStream fis = new FileInputStream("day20_2/person.txt");
        //创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(fis);
        //读取对象
        Object object = ois.readObject();
        System.out.println("object = " + object);
        ois.close();

    }
}
