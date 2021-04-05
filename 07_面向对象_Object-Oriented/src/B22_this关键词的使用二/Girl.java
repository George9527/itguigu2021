package B22_this关键词的使用二;

public class Girl {

    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁：" + boy.getName());
        boy.marry(this);
    }

    /**
     * @Description 比较两个对象的大小
     * @author shkstart
     * @date 2021年3月13日 22点06分
     * @param girl
     * @return 正数：当前对象大  负数：当前对象小 0：当前对象与形参对象相等
     */
    public int compare(Girl girl) {
        if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
