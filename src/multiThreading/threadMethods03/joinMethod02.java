package multiThreading.threadMethods03;

public class joinMethod02 {
    public static void main(String[] args) throws InterruptedException {
        //join()  -- Thread.join() / Thread.join(2000);

        System.out.println("main Thread is started");

        Thread t1=new Thread(()->{
            System.out.println("t1 Thread is started");
        });

        t1.start();

        t1.join();

        System.out.println("main Thread is terminated");
    }
}
