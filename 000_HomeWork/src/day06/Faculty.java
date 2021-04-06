package day06;
/*
    3）	Faculty类中的属性有：
        学位degree（String类型），
        级别level（String类型）；
 */
public class Faculty extends Employee{
    private String degree;
    private String level;
    public Faculty() {

    }
    public Faculty(String degree, String level) {
        this.degree = degree;
        this.level = level;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

}
