package A03_枚举中添加成员变量与方法;

/*
    给枚举中的成员变量 添加一个标识
 */
public enum Gender {
    /**
     * 男
     */
    MALE("男"),
    /**
     * 女
     */
    FEMALE("女");

    private String tag;
    Gender(String tag) {
        this.tag = tag;
    }

    // 然后获取用户的性别标识
    // 利用get方法
    public String getTag() {
        return tag;
    }


}
