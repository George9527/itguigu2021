package A18_对象案例_游客与门票;

// ③；编写出游客类

public class TourerInfo {

    String name;
    int age;
    int tickets = 0;

    public String getName() {
        return name;
    }

    // 游客信息处理方法
    public void metch(String name, int age) {
        tickets = age >= 12 ? 20 : 0;

        if (tickets == 20) {
            System.out.println(name + "的年龄为：" + age + ",门票价格为：20元");
        } else if (tickets == 0) {
            System.out.println(name + "的年龄为：" + age + ",门票免费");
        }

    }

}
