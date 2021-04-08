package A07_方法重写;
/*
    新手机类---子类
 */
public class NewPhone extends Phone {

//    public static void call(String name) {
//        System.out.println("开启视频通话");
//        System.out.println("给" + name + "打电话");
//    }

    // 重写了父类中的方法
    @Override
    public void call(String name) {
        System.out.println("开启视频通话");

        //System.out.println("给" + name + "打电话");
        //利用 super 调用父类中的 call 方法
        super.call(name);
    }
}
