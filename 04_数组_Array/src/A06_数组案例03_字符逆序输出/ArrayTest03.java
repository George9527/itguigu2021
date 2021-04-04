package A06_数组案例03_字符逆序输出;

import java.util.Arrays;

/*
    需求：
        将一组乱序的字符进行升序和逆序后再输出
        字符：a、c、u、b、e、p、f、z
    思路：
        ①：利用char类型的 ASCII码 进行排序操作
        ②；升序利用 Array工具中的sort() 方法
        ③：逆序利用 两层for循环
        ④：逆序利用 数组中的索引值 逆序输出
 */
public class ArrayTest03 {

    public static void main(String[] args) {

        // 创建char[] 数组并存入字符
        char[] character = {'a','c','u','b','e','p','f','z'};
        System.out.print("原字符序列：");
        // 遍历输出
        for (char c : character) {
            System.out.print(c + " ");
        }

        System.out.println(" ");

        // 升序排序
        Arrays.sort(character);
        System.out.print("升序排序后：");
        // 遍历输出
        for (char c : character) {
            System.out.print(c + " ");
        }

        System.out.println(" ");

        // 逆序排序
        System.out.print("逆序排序后：");
        int index = character.length - 1;
        for (int i = index; i <= index && i >= 0; i--) {
            System.out.print(character[i] + " ");
        }

        /*
        方法二：

        System.out.print("\n降序排序后:");
		for(int i=0 ;i<character.length;i++){
			for(int j=character.length-1;j>=i+1;j--){
				if(character[j]>character[j-1]){
					int temp=character[j-1];
					character[j-1]=character[j];
					character[j]=(char) temp;
				}
			}
		}
		for(int i=0;i<character.length;i++){
			System.out.print(character[i]+" ");
		}
         */
    }
}
