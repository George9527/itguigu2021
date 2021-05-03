package B01_交通信号灯;

public enum Color {

    // 定义出信号灯的三个颜色属性并做标识
    RED("红"),GREEN("绿"),YELLOW("黄");
    private String colorTag;

    Color(String colorTag) {
        this.colorTag = colorTag;
    }

    public String getColorTag() {
        return colorTag;
    }
}
