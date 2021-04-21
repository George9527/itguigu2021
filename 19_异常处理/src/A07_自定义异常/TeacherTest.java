package A07_自定义异常;

import java.util.Scanner;

/*
      Java官方已经定义了大量的异常类,但是依然不够,
      以后做项目的时候,会出现的异常,在JDK中没有定义的,需要我们自己定义异常

  - 自定义异常,入伙,继承Exception或者RuntimeException
  - 只有Exception和他的子类,才具有可抛出性
  - 自定义的类中,构造方法,super调用父类构造方法,传递异常信息
 */
public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入分数：");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
//            e.printStackTrace(); // 打印出错误的详细信息
        }
    }
}
