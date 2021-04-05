package B20_JavaBean的使用;
/*
    JavaBean 是一种Java语言写的可重用的组件
        所谓JavaBean 是指符合如下标准的Java类
        > 类的公共的
        > 有一个无参的公共构造器
    有属性，且有对应的 get、set方法

 */
public class Customer {

    private int id;
    private String name;

    public Customer () {

    }

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public String string() {
        return name;
    }

}
