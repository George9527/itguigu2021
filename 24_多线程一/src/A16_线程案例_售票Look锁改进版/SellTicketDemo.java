package A16_线程案例_售票Look锁改进版;

public class SellTicketDemo {
    public static void main(String[] args) {

        SellTicket sellTicket = new SellTicket();

        Thread thread01 = new Thread(sellTicket, "线程一");
        Thread thread02 = new Thread(sellTicket, "线程二");
        Thread thread03 = new Thread(sellTicket, "线程三");

        thread01.start();
        thread02.start();
        thread03.start();

    }
}
