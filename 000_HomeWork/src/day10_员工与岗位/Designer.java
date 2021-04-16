package day10_员工与岗位;
/*
 * 设计师(designer)类属性：奖金
 *      要求：属性私有化，无参有参构造，get/set，getInfo方法（考虑重写）
 */
public class Designer extends Programmer{

    private String bonus;

    public Designer(String language, String bonus) {
        super(language);
        this.bonus = bonus;
    }

    public Designer(String id, String name, String age, String wage, String language, String bonus) {
        super(id, name, age, wage, language);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    // 重写getInfo 方法

    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + bonus;
    }
}
