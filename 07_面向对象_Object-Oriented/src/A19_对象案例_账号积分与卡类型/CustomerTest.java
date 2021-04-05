package A19_对象案例_账号积分与卡类型;

/*
    自定义客户类的测试
 */

public class CustomerTest {
    public static void main(String[] args) {

        // 创建一个客户对象
        Customer customer = new Customer();

        // 调用显示方法，显示客户信息
        customer.showInfo(2000,"金卡");

    }
}
