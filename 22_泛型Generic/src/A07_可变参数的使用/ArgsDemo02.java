package A07_可变参数的使用;

/*
    Arrays工具类中有一个静态方法：
        public static <T> List<T> asList (T... a)：返回由指定数组支持的固定大小的列表

    List接口中有一个静态方法：
        public static <E> List<E> of (E... elements)：返回包含任意数量元素的不可变列表

    Set接口中有一个静态方法：
        public static <E> Set<E> of (E... elements) ：返回一个包含任意数量元素的不可变集合
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
//        //public static <T> List<T> asList (T... a)：返回由指定数组支持的固定大小的列表
//        List<String> list = Arrays.asList("张国荣", "刘德华", "郭富城");
//
////        list.add("黎明"); // --- UnsupportedOperationException
////        list.remove(0); // --- UnsupportedOperationException
//        list.set(2,"黎明");
//        // 小结：不能增加或者删除列表中的元素，修改后改变了集合的大小。但是修改是可以的
//
//        System.out.println(list);

//        //public static <E> List<E> of (E... elements)：返回包含任意数量元素的不可变列表
//        List<String> list = List.of("张国荣", "刘德华", "郭富城");
//
////        list.add("黎明"); // --- UnsupportedOperationException
////        list.remove(0); // --- UnsupportedOperationException
////        list.set(1,"黎明"); // --- UnsupportedOperationException
//        // 小结：通过 List.of() 方法的集合，增，删，改 都是不可以的
//
//        System.out.println(list);

//        //public static <E> Set<E> of (E... elements) ：返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("张国荣", "刘德华", "郭富城");
//
////        set.add("黎明"); // --- UnsupportedOperationException
////        set.remove(1); // --- UnsupportedOperationException
//        // 小结：通过 Set.of() 方法的集合，增，删，改 都是不可以的
//
//        System.out.println(set);
    }
}
