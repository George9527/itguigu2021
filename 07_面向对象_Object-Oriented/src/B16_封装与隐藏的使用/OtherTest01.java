package B16_封装与隐藏的使用;

public class OtherTest01 {

    public static void main(String[] args) {

        Other other = new Other();

        other.orderDefault = 1;
        other.orderPublic = 2;

        //出了Otherlei后，私有的结构就不能调用了
//        other.orderPrivate = 3; //错误或报错

        //出了Order类后，私有的结果不能调用了
        other.methodDefault();
        other.methPublic();
    }

}
