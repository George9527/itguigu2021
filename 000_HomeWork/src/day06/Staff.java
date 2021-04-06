package day06;

/*
    4）	Staff类中的属性有：
        职务称号duty（String类型）。
 */
public class Staff extends Employee{
    private String duty;
    public Staff() {

    }
    public Staff(String duty) {
        this.duty = duty;
    }
    public String getDuty() {
        return duty;
    }
    public void setDuty(String duty) {
        this.duty = duty;
    }

}
