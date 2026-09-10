package multiThreading.threadMethods03;

public class currentThreadMethod06 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Thread t1=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });

        t1.setName("worker 1");

        t1.start();

    }

}
/*
    currentThread() --> reference of current running thread
*/