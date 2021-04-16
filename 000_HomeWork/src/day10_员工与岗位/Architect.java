package day10_员工与岗位;
/*
    * 架构师(architect)类属性：持有股票数量
        要求：属性私有化，无参有参构造，get/set，getInfo方法（考虑重写）
 */
public class Architect extends Designer{

    // 架构师(architect)类属性：持有股票数量
    private String stock;

    public Architect(String language, String bonus, String stock) {
        super(language, bonus);
        this.stock = stock;
    }

    public Architect(String id, String name, String age, String wage, String language, String bonus, String stock) {
        super(id, name, age, wage, language, bonus);
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    // getInfo方法（考虑重写）

    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + getStock();
    }
}
