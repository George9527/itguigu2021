package A20_对象案例_学生成绩排序;

import java.util.Random;

/*
    题目：
        创建20个学生对象，学号为1到20，年级和成绩都由随机数确定
    属性：
        包含三个属性：学号number(int)，年级state(int)，成绩score(int)
     需求：
        一：打印出3年级(state值为3）的学生信息。
        二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

    思路：
        1) 生成随机数： Math.random()，返回值类型double;
        2) 四舍五入取整： Math.round(double d)，返回值类型long
 */
public class StudentTest {
    public static void main(String[] args) {

        // 调用随机数方法
        Random r = new Random();

        // 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定
        Student[] studentNum = new Student[20];

        // 使用循环方法录入年级和成绩
        for (int i = 0; i < studentNum.length; i++) {

            //获取随机数
            int studentID = studentNum.length + 1;
            int studentState = r.nextInt(3) + 1;
            int studentScore = r.nextInt(100) + 1;

            // 创建对象
            studentNum[i] = new Student();

            // 给新建的学生类对象赋值
            studentNum[i].number = studentID;
            studentNum[i].state = studentState;
            studentNum[i].score = studentScore;

            // 测试 --- 输出学生信息
            studentNum[i].infor();
        }

        System.out.println(" ");
        System.out.println("===以下为三年级学生的信息=====");

        // 一：打印出3年级(state值为3）的学生信息。
        for (int i = 0; i < studentNum.length; i++) {
            if (studentNum[i].state == 3) {
                // 调用方法
                studentNum[i].infor();
            }
        }

        // 二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < studentNum.length; i++) {
            for (int j = 0; j < studentNum.length - i - 1; j++) {
                if (studentNum[j].score > studentNum[j + 1].score) {
                    Student temp = studentNum[j];
                    studentNum[j] = studentNum[j + 1];
                    studentNum[j + 1] = temp;
                }
            }
        }

        // 调用方法输出 冒泡排序 后的数组
        System.out.println(" ");
        System.out.println("冒泡排序后的结果：");
        for (int i = 0; i < studentNum.length; i++) {
            // 调用方法
            studentNum[i].infor();
        }
    }
}
