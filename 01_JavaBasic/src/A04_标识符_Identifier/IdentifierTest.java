package A04_标识符_Identifier;
/*
标识符的使用
1.标识符：凡是自己可以起名字的地方都叫标识符。
   比如：类名、变量名、方法名、接口名、包名...

2.标识符的命名规则：--> 如果不遵守如下的规则，编译不通过！需要大家严格遵守

> 由26个英文字母大小写，0-9 ，_(下划线)或 $(美元符) 组成
> 数字不可以开头。
>开头可以用26个英文字母大小写、_(下划线)或 $(美元符) 组成
> 不可以使用关键字和保留字，但能包含关键字和保留字。
> Java中严格区分大小写，长度无限制。
> 标识符不能包含空格。

3. Java中的名称命名规范： --->如果不遵守如下的规范，编译可以通过！建议大家遵守

包名：多单词组成时所有字母都小写：xxxyyyzzz
类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ

4.
注意1：在起名字时，为了提高阅读性，要尽量有意义，“见名知意”。
注意2：java采用unicode字符集，因此标识符也可以使用汉字声明，但是不建议使用。

5.
    可以参考阿里的代码规范书
*/
public class IdentifierTest {
    public static void main(String[] args) {
        int myNumber = 1000;
        System.out.println(myNumber);
        int myNumber2 = 2000;
        System.out.println(myNumber2);

        // 按照标识符规则，正确声明变量
        int age = 10;
        String studentName = "tom";
        int age2 = 15;
        int student_age = 13;
        int $systemInfo = 555;

        System.out.println(age);
        System.out.println(studentName);
        System.out.println(age2);
        System.out.println(student_age);
        System.out.println($systemInfo);

        // 违反标识符规则声明变量的举例
        // 例子1：使用的%不属于允许使用的范围
        // int age%me = 5;

        // 例子2：不能以数字开头
        // int 2age = 50;

        // 例子3：不能包含空格
        // int age student = 33;

        // 例子4：严格区分大小写
        // int salary = 10;
        // System.out.println(Salary);

        // 违反标识符规范声明变量举例：
        int STUDENT_AGE = 10;
        System.out.println(STUDENT_AGE);
    }
}
