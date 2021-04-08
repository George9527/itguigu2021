package B02_instanceof_类型转换判断;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();

        // 判断 animal 是不是 Cat类的对象
        boolean b = animal instanceof Dog;
        System.out.println(b);
        // 这里的 animal 不是 Dog类的对象是 Cat类的
        // 故 返回值为 false 不能进行类型的转换

        if (animal instanceof Cat) {
            // 如果 是 CAt对象 则为 true 强转为 cat对象
           Cat cat = (Cat) animal;
           // 调用cat的特有方法
           cat.catthMouse();
        }
    }
}
