package D02_Set的哈希值;
/*
    哈希值：
        是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值

    Object类中有一个方法可以获取对象的哈希值
        public int hashCode()：返回对象的哈希码值
 */
public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("张国荣",35);
        Student s2 = new Student("刘德华",30);
        Student s3 = new Student("张国荣",35);

        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode()); // --- 1060830840
        System.out.println(s1.hashCode()); // --- 1060830840
        System.out.println(s2.hashCode()); // --- 2137211482
        System.out.println("-----------");

        //默认情况下，是不一样的。
        //通过方法重写后可以实现不同对象的哈希值是相同的
        //不同的对象相同的内容。调用hashCode()方法返回的哈希值是不同的
        System.out.println(s1.hashCode()); // --- 1060830840
        System.out.println(s3.hashCode()); // --- 920011586
        System.out.println("----------");

        //注意这里的 world 字符串相同，对象相同。故哈希值也相同
        System.out.println("hello".hashCode()); //99162322
        System.out.println("world".hashCode()); //113318802
        System.out.println("java".hashCode()); //3254818

        System.out.println("world".hashCode()); //113318802
        System.out.println("--------");

        // “哈希冲突”
        // 字符串重写了hashCode()方法
        System.out.println("重地".hashCode()); //1179395
        System.out.println("通话".hashCode()); //1179395
        System.out.println("地球".hashCode()); //721619
        System.out.println("世界".hashCode()); //649718

    }
}
