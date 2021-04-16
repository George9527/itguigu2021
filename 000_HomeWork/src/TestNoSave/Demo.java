package TestNoSave;

public class Demo {
    public static void main(String[] args) {
        Test test = new Test(){
            @Override
            public void func() {
                System.out.println("function");
            }
        };
        test.func();
    }
}
