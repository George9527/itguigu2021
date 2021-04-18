package D08_自然排序Comparable的使用;

/*
    创建学生类
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    //方法重写

    @Override
    public int compareTo(Student s) {
//        return 0; --- 系统会认为是相同元素，集合只会添加一个元素
//        return 1; --- 系统使用正序来排列添加的元素
//        return -1; --- 系统使用倒序来排列添加的元素
        //要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
        int num = this.age - s.age;
        //从大到小
        // int num = s.age - this.age;
        //年龄相同时，按照姓名的字母顺序排序
        int num2 = num == 0 ? this.name.compareTo(s.name):num;
        return num2;
    }
}
