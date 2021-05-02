package A15_字节流复制视频;

import java.io.*;

/*
- 案例需求

  把“E:\\itcast\\字节流复制图片.avi”复制到模块目录下的“字节流复制图片.avi”

- 实现步骤

  - 根据数据源创建字节输入流对象

  - 根据目的地创建字节输出流对象
  - 读写数据，复制视频
  - 释放资源
 */
public class CopyAviDemo {

    public static void main(String[] args) {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
//        method1();
//        method2();
//        method3();
//        method4();

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");

    }

    //字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\itcast\\字节流复制图片.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\字节流复制图片.avi"));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1) {
            bos.write(bys,0,len);
        }

        bos.close();
        bis.close();
    }

    //字节缓冲流一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\itcast\\字节流复制图片.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\字节流复制图片.avi"));

        int by;
        while ((by=bis.read())!=-1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }


    //基本字节流一次读写一个字节数组
    public static void method2() throws IOException {
        //E:\\itcast\\字节流复制图片.avi
        //模块目录下的 字节流复制图片.avi
        FileInputStream fis = new FileInputStream("E:\\itcast\\字节流复制图片.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\字节流复制图片.avi");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1) {
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();
    }

    //基本字节流一次读写一个字节
    public static void method1() throws IOException {
        //E:\\itcast\\字节流复制图片.avi
        //模块目录下的 字节流复制图片.avi
        FileInputStream fis = new FileInputStream("E:\\itcast\\字节流复制图片.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\字节流复制图片.avi");

        int by;
        while ((by=fis.read())!=-1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }
}
