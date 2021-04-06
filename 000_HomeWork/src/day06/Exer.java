package day06;

/*
    5）	现有对象
    Person p1 =new Faculty()和Person p2 =new Staff ()，
    请分别为p1的属性赋值“本科”和Staff类的duty赋值“职员”
 */
public class Exer {

    public static void main(String[] args) {
        Person p1 = new Faculty();
        Person p2 = new Staff();
        if (p1 instanceof Faculty) {
            Faculty p11 = (Faculty) p1;
            p11.setLevel("本科");
            System.out.println(p11.getLevel());
        }else {
            System.out.println("p1不是Faculty的对象");
        }
        if (p2 instanceof Staff) {
            Staff p21 = (Staff) p2;
            p21.setDuty("职员");
            System.out.println(p21.getDuty());
        }else {
            System.out.println("p2不是Duty的对象");
        }
    }

}
