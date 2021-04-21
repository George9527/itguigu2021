package A04_Thread类方法;

public class ThreadName extends Thread{

    public void run (){
        System.out.println("线程名字:: "+ super.getName());
    }
}
