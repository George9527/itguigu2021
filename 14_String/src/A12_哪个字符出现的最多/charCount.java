package A12_哪个字符出现的最多;
/*
    ###  哪个字符出现的最多

  要求 : 指定字符串自能是(小写)字母 abeegewff , 计算出哪个字符出现的次数最多

  限定字符串中字母只能有26个

> 找每个字符各自出现多少次,找出最大值

- 实现过程 :
  - 字符串转成数组 (单个字符操作)
  - 创建长度为26的数组,计数器使用
  - 取出数组中的字符, (字符-97)对应数组的索引,计数器++
  - 找出数组中的最大值
 */

/**
 * 查找字符串中,哪个字符出现的次数最多
 * @param str  要查找字符串
 * @return  返回出现次数最多的字符
 */

public class charCount {
    public static void main(String[] args) {
        // 定义一个字符串
        String str = "aaaaaabbbbbccccccccccccc";

        // 字符串转成数组
        char[] chars = str.toCharArray();
        // 定义26长度的数组,保存每个字符出现的次数
        int[] count = new int[26];

        //遍历数组
        for (int i = 0; i < chars.length; i++) {
            // 取出单个字符
            char ch = chars[i];
            //字符 - 97 作为数组的索引使用 (数组,计数器数组)
            count[ch - 97]++;
        }

        for (int i : count) {
            System.out.print(i + " ");
        }

        //取出count数组中的,最大值的索引
        int index = 0;
        int max = count[0]; // 设第一个索引为最大值，依次遍历，交换位置

        for (int i = 0; i < count.length; i++) {
            // 比较大小
            if (max < count[i]) {
                index = i;
                max = count[i];
            }
        }

        // 输出结果
        System.out.println(" ");
        System.out.println("最大值的索引: " + index);
        System.out.println("出现的个数: " + max);

        System.out.println("最多出现的字符：" + (char)(index + 97));
    }
}
