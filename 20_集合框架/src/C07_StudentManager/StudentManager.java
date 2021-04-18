package C07_StudentManager;

/*
    学生管理系统:
        1:用输出语句完成主界面的编写
        2：用Scanner实现键盘录入数据
        3：用switch语句完成操作的选择
        4：用循环完成再次回到主界面

    快捷键：
        CTRL + alt + L  ---用于快速调整代码格式
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    //程序主菜单
    public static void main(String[] args) {
        //用循环完成再次回到主界面

        //创建用户错误输入次数-计算器
        int user_testnumber = 0;

        //创建空集合对象，用于存储学生信息
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {

            //使用if语句判断用户输入是否为1-5的正整数

            if (user_testnumber == 5) {
                System.out.println("错误次数达到5次！强制退出系统！");
                System.exit(1);
            } else {

                //用输出语句完成主界面的编写
                System.out.println("----------欢迎来到学生管理系统----------");
                System.out.println("1.添加学生");
                System.out.println("2.删除学生");
                System.out.println("3.修改学生");
                System.out.println("4.查询所有学生");
                System.out.println("5.退出系统");
                System.out.print("请输入您的选择：");

                //用Scanner实现键盘录入数据
                Scanner sc = new Scanner(System.in);

                int userchose = sc.nextInt();

                if (userchose <= 5 && userchose >= 1) {

                    user_testnumber = 0;

                    //用switch语句完成操作的选择

                    switch (userchose) {
                        case 1:
                            System.out.println("添加学生---ing");
                            addStudent(array);
                            break;
                        case 2:
                            System.out.println("删除学生---ing");
                            deleteStudent(array);
                            break;
                        case 3:
                            System.out.println("修改学生---ing");
                            updateStudent(array);
                            break;
                        case 4:
                            /*
                            检测是否空列表的方法二：
                            if(array.size() > 0){
                                System.out.println("查看所有学生---ing");
                                findAllStudent(array);
                                break;
                            } else {
                                System.out.println("系统中没有学生信息！请添加后再尝试！");
                                break;
                            }
                             */
                            System.out.println("查看所有学生---ing");
                            findAllStudent(array);
                            break;

                        case 5:
                            System.out.println("成功退出学生管理系统----欢迎下次继续使用!!");
                            //break;    ---break不能实现完全退出系统！！
                            System.exit(1);
                    }
                } else {
                    System.out.println("输入错误！---请输入1-5的正整数:");
                    System.out.println("当前还剩下" + (4 - user_testnumber) + "次机会尝试！！");
                    user_testnumber += 1;
                }
            }
        }
    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据，显示提示信息，提示要录入何种信息
        Scanner sc = new Scanner(System.in);

        //为了让 sid 在循环外面被访问到，需要定义在循环外
        String sid;

        //为了让程序回到这里使用循环
        while (true) {
            System.out.println("请输入学生的学号：");
            sid = sc.nextLine();

            //检查学号是否被占用
            boolean flag = isUser(array,sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生的居住地：");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);

        //给出添加成功提示
        System.out.println("学生姓名：" + s.getName());
        System.out.println("---信息添加成功!!---");

    }

    //定义一个方法，用于查看所有学生信息
    public static void findAllStudent(ArrayList<Student> array){
        //判断集合中是否有数据，没有则显示提示信息
        if(array.size() == 0) {
            System.out.println("系统中没有学生信息！请添加后再尝试！");
            //为了让程序不在往下执行，可以添加 retur
            return;
        }

        //显示表头信息
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");

        //将集合中数据去除按照对应格式显示学生信息，年龄显示补充 ”岁“
        //遍历集合 通用格式
        for (Student s : array) {
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" +
                    s.getAge() + "岁" + "\t " + s.getAddress());
        }

    }

    //定义一个方法，用于将学生信息从集合中删除
    /*
    public static void deleteStudent(ArrayList<Student> array) {
        //键盘录入要删除的学生学号，并显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入即将删除的学生学号：");
        String sid = sc.nextLine();

        //遍历集合将对应学生对象从集合中删除
        for (int i=0; i<array.size(); i++) {
            Student s= array.get(i);
            //字符串比较用 equals 方法
            if(s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }
        //给出删除成功的提示
        System.out.println("删除学生成功");
    }

     */
    public static void deleteStudent(ArrayList<Student> array) {
        //键盘录入要删除的学生学号，并显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入即将删除的学生学号：");
        String sid = sc.nextLine();

        //在删除学生之前，对学号是否存在进行判断
        //如果不存在，显示提示信息
        //如果存在，执行删除操作
        int index = -1;
        for (int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请先查询所有学生信息！");
            System.out.println("确认该信息是否存在再输入！！！");
        } else {
            array.remove(index);
            //给出删除成功提示
            System.out.println("删除学生成功！！！");
        }

    }

    //定义一个方法，用于修改集合中的学生信息
    /*
    public static void updateStudent(ArrayList<Student> array) {
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入即将修改的学生学号：");
        String sid = sc.nextLine();

        //键盘录入要修改的学生信息
        System.out.println("请输入新的学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新的学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入新的学生居住地：");
        String address = sc.nextLine();

        //创建学生对象
        //创建新的空对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //遍历集合修改对应的学生信息
        //遍历的通用格式
        for (int i=0; i<array.size(); i++) {
            Student student = array.get(i);
            if(student.getSid().equals(sid)) {
                array.set(i,s);
                break;
            }
        }
        //给出修改成功提示
        System.out.println("修改学生成功！");
    }

     */
    public static void updateStudent(ArrayList<Student> array) {
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入即将修改的学生学号：");
        String sid = sc.nextLine();

        //在删除学生之前，对学号是否存在进行判断
        //如果不存在，显示提示信息
        //如果存在，执行删除操作
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请先查询所有学生信息！");
            System.out.println("确认该信息是否存在再输入！！！");
        } else {
            //键盘录入要修改的学生信息
            System.out.println("请输入新的学生姓名：");
            String name = sc.nextLine();
            System.out.println("请输入新的学生年龄：");
            String age = sc.nextLine();
            System.out.println("请输入新的学生居住地：");
            String address = sc.nextLine();

            //创建学生对象
            //创建新的空对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);


            //遍历集合修改对应的学生信息
            //遍历的通用格式
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                if (student.getSid().equals(sid)) {
                    array.set(i, s);
                    break;
                }
            }
            //给出修改成功提示
            System.out.println("修改学生成功！");
        }
    }

    //定义一个方法，判断学号是否被使用
    public static boolean isUser(ArrayList<Student> array, String sid) {
        //如果与集合中的某一个学生学号占用，返回Ture。没有相同，则返回False
        boolean flag = false;
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}