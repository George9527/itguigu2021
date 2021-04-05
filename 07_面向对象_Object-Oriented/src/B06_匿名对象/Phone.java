package B06_匿名对象;

//创建Phone类

public class Phone {
    double price;  //价格

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

    public void showPrice() {
        System.out.println("手机价格：" + price);
    }
}
