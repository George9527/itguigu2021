package D12_对象的哈希值;

/*
    方法使用没有区别 : 方法返回int类型的值,就称为哈希值

哈希值的结果不知道是怎么计算的,调用toString()方法的时候,返回的十六进制数和哈希值是一样的, @1b6d3586叫哈希值 (根本和内存地址是无关的)
 */
public class hashCodeDemo {

    public static void main(String[] args) {

        Person p = new Person();
        int code = p.hashCode();
        // int 变量 460141958 (是什么,无所谓, 数字就是对象的哈希值)
        System.out.println(code);
        // com.atguigu.hash.Person@1b6d3586
        System.out.println(p.toString());

    }


}
