package day06;

/*
    2）	Employee类中的属性有：
        办公室office（String类型），
        工资wage（double类型），
        受雇日期hiredate（String类型）；

 */
public class Employee extends Person{
    private String office;
    private double wage;
    private String hiredate;
    public Employee() {

    }
    public Employee(String office, double wage, String hiredate) {
        this.office = office;
        this.wage = wage;
        this.hiredate = hiredate;
    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public String getHiredate() {
        return hiredate;
    }
    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

}
