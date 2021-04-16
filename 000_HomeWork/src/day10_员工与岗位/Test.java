package day10_员工与岗位;
/*
    声明员工类、程序员类、设计师类、架构师类，
        * 员工类(employee)属性：编号、姓名、年龄、薪资
        * 程序员(Programmer)类属性：编程语言，默认都是"java"
        * 设计师(designer)类属性：奖金
        * 架构师(architect)类属性：持有股票数量

    要求：属性私有化，无参有参构造，get/set，getInfo方法（考虑重写）

    遍历数组：按以下格式输出
        编号	姓名	年龄	薪资	语言	奖金	股票
 */
public class Test {

    public static void main(String[] args) {

        final int EMPLOYEE = 10;//表示普通员工
        final int PROGRAMMER = 11;//表示程序员
        final int DESIGNER = 12;//表示设计师
        final int ARCHITECT = 13;//表示架构师

        String[][] EMPLOYEES = {
                {"10", "1", "段誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭靖", "25", "7100"},
                {"12", "12", "黄蓉", "27", "9600", "4800"}
        };

        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i][0].equals("13")) {
                for (int j = 1; j <  EMPLOYEES[i].length; j++) {
                    // 遍历输出对象信息
//                    System.out.print(EMPLOYEES[i][j]);
                    // 存进对应的 对象中
                    Employee employee = new Employee();
                    employee.setId(EMPLOYEES[i][j]);
                    employee.setName(EMPLOYEES[i][j + 1]);
                    employee.setAge(EMPLOYEES[i][j + 2]);
                    employee.setWage(EMPLOYEES[i][j + 3]);
                    employee.getInfo();
                }
            }
        }
    }

}
