package A05_字节流写数据加异常处理;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo05 {
    public static void main(String[] args) {
        // 调用方法
    }

    /**
     * try catch异常处理 : close()写在finally
     */
    public static void write2() {
        //提升作用域 : try外定义变量,try创建对象
        FileOutputStream fos = null;
        FileOutputStream fos2 = null;
        try {
            //创建字节输出流对象,构造方法中,绑定文件路径,写入目的
            fos = new FileOutputStream("c:/1.txt");
            fos2 = new FileOutputStream("c:/2.txt");
            //写入单个字节
            fos.write(45);
            fos.write(49);
            fos.write(48);
            fos.write(48);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            //释放资源
            try {
                //流对象创建失败,fos变量的值是空,不能调用close
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            //释放资源
            try {
                //流对象创建失败,fos变量的值是空,不能调用close
                if (fos2 != null) {
                    fos2.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    /**
     * try catch异常处理 : close()写在finally
     */
    public static void write() {
        //提升作用域 : try外定义变量,try创建对象
        FileOutputStream fos = null;
        try {
            //创建字节输出流对象,构造方法中,绑定文件路径,写入目的
            fos = new FileOutputStream("q:/1.txt");
            //写入单个字节
            fos.write(45);
            fos.write(49);
            fos.write(48);
            fos.write(48);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            //释放资源
            try {
                //流对象创建失败,fos变量的值是空,不能调用close
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
