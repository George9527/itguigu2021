package A07_输出语句_print;
/*
    注意事项：

	换行输出语句，括号内可以什么都不写，只做换行处理

	直接输出语句，括号内什么都不写的话，编译报错

	如果()中有多项内容，那么必须使用 + 连接起来

	如果某些内容想要原样输出，就用""引起来，而要输出变量中的内容，则不要把变量名用""引起来
 */
public class PrintDemo {
    public static void main(String[] args) {

        // 换行输出语句，括号内可以什么都不写，只做换行处理
        System.out.println();

        // 直接输出语句，括号内什么都不写的话，编译报错
//        System.out.print();
        // 小结：注意 println 与 println 的区别

        //
        String name = "柴林燕";
        int age = 18;

//        对比如下两组代码：
        System.out.println(name);
        System.out.println(age);
        System.out.print(name);
        System.out.print(age);

//        对比如下两组代码：
        System.out.print("姓名：" + name +",");//""中的内容会原样显示
        System.out.println("年龄：" + age);//""中的内容会原样显示
        // 小结：
        // 如果某些内容想要原样输出，就用""引起来，
        // 而要输出变量中的内容，则不要把变量名用""引起来

        // 如果()中有多项内容，那么必须使用 + 连接起来
        System.out.print("name = " + name + ",");
        System.out.println("age = " + age);
    }
}
