package A01_IO流概述;

/*
    ### 2.1 IO流对象的分类

#### 2.1.1 按照操作的文件类型分类

- 文本类型文件  -- 选择流对象字符流
  - 什么是文本文件 : 使用文本工具,记事本,notepad++ ,editplus 打开文件后人类可以直接阅读
- 非文本类型文件  -- 选择流对象字节流

#### 2.1.2 按照数据的流向分类

-  输入流 : Java程序从其它地方读取数据
-  输出流 : Java程序中的数据,写入到其它地方

#### 2.1.3 IO流对象的分类归纳

- 字节输出流 : OutputStream 抽象类
- 字节输入流 : InputStream 抽象类
- 字符输出流 : Writer 抽象类
- 字符输入流 : Reader 抽象类

## 3. 字节输出流

  java.io.OutputStream是所有字节输出流的超类 : 可以写入任何类型文件

- 写入字节的方法 write
  - void write(int b) 写入单个字节
  - void write(byte[] b)写入字节数组
  - void write(byte[] b,int off,int len) 写入数组的一部分,开始索引,写入的个数

### 3.1 FileOutputStream

- 构造方法 :  FileOutputStream(File file)
- 构造方法 :  FileOutputStream(String file)
  - 创建字节输出流对象,绑定参数就是要写入的数据目的

> JVM很聪明 : 任何一个操作系统都具备IO的能力, JVM依赖操作系统实现IO功能,IO流对象使用完毕后,要释放资源

### 3.2 字节输出流写入文件的步骤

- 创建字节输出流对象,构造方法中,绑定文件路径,写入目的
- 调用流对象的方法write写入数据
- 释放资源

 */
public class IODemo01 {
}
