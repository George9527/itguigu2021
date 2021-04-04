package D12_数组案例_存储学生成绩;

/*
    需求：
        定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，
    统计各成绩等级
        （90分以上为‘A’，80~89分为‘B’，70~79分为‘C’，60~69分为‘D’，60分以下为E）
    统计各成绩学生人数并将其放入到数组count中，
        其中：count[0]存E级的人数，count[1]存D级的人数，……，count[4]存A级的人数。
 */
public class ArrayTest08 {

    public static void main(String[] args) {

        // 自定义数组 --- 动态方法
        int[] count = new int[5];

        int a = 0, b = 0, c = 0, d = 0, e = 0;

        // 使用静态方法创建数组
        int[] studentScore = {72, 89, 65, 58, 87, 91, 53, 82, 71, 93, 76, 68};

        // 判断成绩等级

        for (int i = 0; i < studentScore.length; i++) {
            if (studentScore[i] >= 90) {
                a += 1;
                count[0] = a;
            } else if (studentScore[i] >= 80 && studentScore[i] < 90) {
                b += 1;
                count[1] = b;
            } else if (studentScore[i] >= 70 && studentScore[i] < 80) {
                c += 1;
                count[2] = c;
            } else if (studentScore[i] >= 60 && studentScore[i] < 70) {
                d += 1;
                count[3] = d;
            } else if (studentScore[i] >= 0 && studentScore[i] < 60) {
                e += 1;
                count[4] = e;
            }
        }

        System.out.println("A等级\tB等级\tC等级\tD等级\tE等级");
        // 循环输出结果
        for (int i : count) {
            System.out.print(i + "\t\t");
        }
    }
}

/*

package t3;
public class TestArray2{
	public static void main(String[]args){
		int []a={72,89,65,58,87,91,53,82,71,93,76,68};//显示初始化数组a，将学生成绩存到数组
		int []count=new int[5];//定义一个数组存储成绩每等级个数
		for(int i=0;i<a.length;i++){//遍历数组a
			if(a[i]>=90){//if else语句分级，并将个数存到对应空间中
				count[4]++;
			}else if(a[i]>=80){
				count[3]++;
			}else if(a[i]>=70){
				count[2]++;
			}else if(a[i]>=60){
				count[1]++;
			}else{
				count[0]++;
			}
			/*
			if(score[i]>=60){//归纳出简便方法
				count[score[i]/10-5]++;
			}else{
				count[0]++;
			}

		}
                System.out.print("A等级\tB等级\tC等级\tD等级\tE等级\t");
                System.out.println();
                for(int j=count.length-1;j>=0;j--){//从后往前遍历count
                System.out.print("  "+count[j]+"\t");
                }

                }

 */
