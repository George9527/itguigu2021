package day10_员工与岗位;
/*
 * 员工类(employee)属性：编号、姓名、年龄、薪资
 *      要求：属性私有化，无参有参构造，get/set，getInfo方法（考虑重写）
 */
public class Employee {

    // 员工类(employee)属性：编号、姓名、年龄、薪资
    private String id;
    private String name;
    private String age;
    private String wage;

    public Employee() {
    }

    public Employee(String id, String name, String age, String wage) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    // getInfo方法

    public String getInfo(){
        return id + "\t" + name + "\t" + age + "\t" + wage;
    }
}
