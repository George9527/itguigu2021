package B16_封装与隐藏的使用;

public class Other {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    public void methPublic() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

}
