package A10_老师与学生升级;

public class Teacher extends Human {
    //自定义一个无参方法
    public Teacher() {}

    //自定义一个带参数方法
    public Teacher(String name, int age) {
        super(name,age);
    }

    //老师类独有方法
    public void teach() {
        System.out.println("职业：老师");
    }

}
