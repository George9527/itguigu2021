package A07_StringBuilder的索引添加方法;

/**
 *  StringBuilder insert(int 索引, 任意类型)
 *      可以将任意类型的参数,插入到字符串缓冲区,指定索引.
 */

public class StringBuilderTest07 {
    public static void main(String[] args) {

        // 新建一个StringBuilder类的对象
        StringBuilder sb = new StringBuilder();

        // 使用 append() 添加字符串
        sb.append("Hello World");

        // 输出长度
        System.out.println("长度为：" + sb.length());

        // 指定的索引上,添加字符串,原有字符,顺延
        sb.insert(11," Java");

        // 输出完成后的内容
        System.out.println(sb);
    }
}
