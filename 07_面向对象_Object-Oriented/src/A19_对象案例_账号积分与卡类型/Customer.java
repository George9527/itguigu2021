package A19_对象案例_账号积分与卡类型;

/*
    需求：
        ①：编写客户端
            属性：积分、卡类型
            方法show()：显示客户卡信息(显示积分、卡类型)
        ②：积分回馈
            金卡客户积分大于1000分或普卡客户积分大于5000，回馈500分
            输出回馈积分
 */

public class Customer {

    // 属性：积分、卡类型
    int mark;
    String cardType;

    // 创建无参与带参的构造方法

    public Customer() {
    }

    public Customer(int mark, String cardType) {
        this.mark = mark;
        this.cardType = cardType;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    // 创建一个显示方法
    // 金卡客户积分大于1000分或普卡客户积分大于5000，回馈500分
    public void showInfo(int mark, String cardType) {
        System.out.println("积分：" + mark + ",卡类型：" + cardType);
        if (mark > 1000 && cardType.equals("金卡") || mark > 5000 && cardType.equals("普卡")) {
            System.out.println("回馈积分500分！");
        }
    }
}
