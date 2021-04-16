package test;

public class Something {

    int i;

    public void doSomething() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Something something = new Something();
        something.doSomething();
    }
}