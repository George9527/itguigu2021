package A03_枚举中添加成员变量与方法;

public class Demo02 {
    public static void main(String[] args) {
        Person p1 = new Person("小明", Gender.MALE);
        System.out.println("p1 = " + p1);

        // 然后获取用户的性别标识
        System.out.println("Gender.MALE.getTag() = " + Gender.MALE.getTag());

        // 输出用户的详细信息
        System.out.println("性别：" + p1.getName() + " 性别：" + Gender.MALE.getTag());
    }
}
