package day10_员工与岗位;

/*
    程序员(Programmer)类属性：编程语言，默认都是"java"
        要求：属性私有化，无参有参构造，get/set，getInfo方法（考虑重写）
 */

public class Programmer extends Employee{

    // 编程语言，默认都是"java"
    private String language = "java";

    public Programmer(String language) {
        this.language = language;
    }

    public Programmer(String id, String name, String age, String wage, String language) {
        super(id, name, age, wage);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // 重写 getInfo
//
//    @Override
//    public String getInfo() {
//        return super.getInfo() + "\t" + getLanguage();
//    }
}
