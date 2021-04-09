package A07_接口与接口的关系;
/*
    类和类之间是继承关系(单继承),
    类和接口之间是实现关系(多实现implements),
    接口和接口之间是继承关系,支持多继承,
    一个接口可以同时继承多个接口.
     `interface A extends B,C,D{}`

     接口的多继承出现类
     子接口是A，父接口是B，C
     A接口中，有B和C的成员
 */
public interface A extends B,C{
}
