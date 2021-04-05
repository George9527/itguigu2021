package B05_面向对象案例学生信息;
/*
    4. 对象数组题目：
        定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
        创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
        问题一：打印出3年级(state值为3）的学生信息。
        问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class Student {

    //创建属性
    int number; // 学号
    int state; // 年级
    int score; // 成绩

    //显示学生信息的方法
    public String info() {
        return "学号：" + number + " |年级:" + state + " |成绩:" + score;
    }
}
