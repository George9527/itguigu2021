package A20_对象案例_学生成绩排序;
// 创建学生类建议一个学生信息显示的方法
public class Student {

    // 自定义属性
    int number;
    int state;
    int score;

    // 显示学生信息
    public void infor() {
        System.out.println("学号：" + number + "\t" + "年级：" + state + "\t" + "分数：" + score);
    }

}
