package B22_this关键词的使用二;

public class BoyandGirlTest {

    public static void main(String[] args) {

        Boy boy = new Boy();
        boy.setName("小明");
        boy.setAge(23);

        boy.shout();

        Girl girl = new Girl();
        girl.setName("小红");
        girl.setAge(20);

        girl.marry(boy);

        Girl girl1 = new Girl("小英",12);

        int compare = girl.compare(girl1);
        if (compare > 0) {
            System.out.println(girl.getName() + "大");
        } else if (compare < 0) {
            System.out.println(girl1.getName() + "大");
        } else {
            System.out.println("一样大");
        }
    }
}
