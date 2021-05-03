package B04_集合到文件改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
### 集合到文件改进版【应用】

- 案例需求:
      把ArrayList集合中的学生数据写入到文本文件。
      要求：每一个学生对象的数据作为文件中的一行数据
      格式：学号,姓名,年龄,居住地	举例：itheima001,林青霞,30,西安

- 实现步骤:
      - 定义学生类
      - 创建ArrayList集合
      - 创建学生对象
      - 把学生对象添加到集合中
      - 创建字符缓冲输出流对象
      - 遍历集合，得到每一个学生对象
      - 把学生对象的数据拼接成指定格式的字符串
      - 调用字符缓冲输出流对象的方法写数据
      - 释放资源
 */

public class ArrayListToFileDemo02 {
    public static void main(String[] args) throws IOException {

        // 创建ArrayList集合
        ArrayList<Student> array = new ArrayList<Student>();

        // 创建学生对象
        Student s1 = new Student("001", "林青霞", 30, "西安");
        Student s2 = new Student("002", "张曼玉", 35, "武汉");
        Student s3 = new Student("003", "王祖贤", 33, "郑州");

        // 把学生对象添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        // 迭代器遍历
        Iterator<Student> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Project\\Java\\SGG2021\\25_IO流对象\\src\\CopyDemo\\Demo03.txt"));

        // 遍历集合，得到每一个学生对象
        for (Student s : array) {
            // 把学生对象的数据拼接成指定格式的字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(":").append(s.getName()).append(":").append(s.getAge()).append(":").append(s.getAddress());

            // 调用字符缓冲输出流对象的方法写数据
            bw.write(sb.toString());
            bw.newLine(); // 换行符
            bw.flush(); // 刷新
        }

        // 释放资源
        bw.close();
    }
}
