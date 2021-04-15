package A04_数组的扩容;

/**
 * static void arraycopy( Object src,int srcPos,Object dest, int destPos,int length  )复制数组的元素.
 * - src : 要赋值的数据源,源数组
 * - srcPos : 源数组的开始索引
 * - dest : 要复制的目标数组
 * - destPos : 目标数组的开始索引
 * - length : 要复制的元素个数
 */

public class systemArraycopy {
    public static void main(String[] args) {

        // 创建两个数组
        int[] src = {1,3,5,7,9};
        int[] dest = {2,4,6,8,0};

        //数组元素的赋值 : src数组中的3,5 复制到dest数组中0索引开始
        System.arraycopy(src,1,dest,0,2);

        // 遍历输出
        for (int i : dest) {
            System.out.print(i + " ");
        }
    }
}
