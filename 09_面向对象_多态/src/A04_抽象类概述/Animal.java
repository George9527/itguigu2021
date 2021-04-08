package A04_抽象类概述;
/*
    任务：
        新建一个抽象类和抽象方法

    小结：
        抽象方法必须在抽象类中
        抽象方法没有方法体, 不需要{},直接分号结束

    关键词：
        abstract
        方法体不给具体方法为抽象方法

    格式：
        权限修饰符 abstract 返回值类型 方法名字(参数列表);

 */

//定义为抽象类
public abstract class Animal {

    // 定义为抽象方法
    public abstract void eat();
}
