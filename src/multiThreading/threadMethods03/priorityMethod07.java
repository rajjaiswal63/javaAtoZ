package multiThreading.threadMethods03;

public class priorityMethod07 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("t1 priority "+Thread.currentThread().getPriority());
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println("main priority "+Thread.currentThread().getPriority());
    }
}
/*
    Thread Priority
    MAX_PRIORITY = 10
    MIN_PRIORITY = 1
    NORM_PRIORITY = 5

    Depends on OS
    -> may respect Priority
    -> may partially repsect
    -> may not at all

*/