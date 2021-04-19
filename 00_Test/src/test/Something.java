package test;

public class Something {

    int a = 10;
    int b = 9;

    public void f(){
        a = 0;
        b = 8;

        int[] c = {0};
        g(b,c);
        System.out.println(a + " " + b + " " + c[0]);
    }
    public void g(int a, int[] c){
        a = 1;
        b = 1;
        c[0] = 1;
    }
    public static void main(String[] args) {
        Something t = new Something();
        t.f();
    }

}