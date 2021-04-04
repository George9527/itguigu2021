package A05_变量_Variable;
/*
	变量定义格式：
		数据类型 变量名 = 变量值;
		int number = 10;

	基本数据类型：
		byte,short,int,long,float,double,char,boolean

	变量的使用：
		取值格式：变量名
		System.out.println(number);

	变量定义格式：
		数据类型 变量名 = 变量值;

	基本数据类型：
		byte,short,int,long,float,double,char,boolean

	变量的使用：
		取值格式：变量名

		修改值格式：变量名 = 变量值;

	说明：
	    变量必须先声明后使用
	    错误例子：
	        myAge = 10;
	        int myAge;
	        编译错误：使用 myAge 变量前未定义该变量
*/

public class VariableDemo01 {
    public static void main(String[] args) {
        // 定义变量
        int a = 10;

        // 输出变量
        System.out.println("修改前的变量值");
        //变量的使用
        System.out.println(a);

        // 修改变量
        a = 20; // 重新赋值
        System.out.println("修改后的变量值");
        System.out.println(a);

        //变量的声明 --- 仅声明并不使用
        int myAge;
        //变量的赋值
        myAge = 20;
        //变量的使用 --- 变量必须赋值后才能使用 否则报错 “未初始化”
        System.out.println("我的年龄：" + myAge);

    }
}