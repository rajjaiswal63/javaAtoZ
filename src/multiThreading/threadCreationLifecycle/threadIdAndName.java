package multiThreading.threadCreationLifecycle;

public class threadIdAndName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Thread t1= new Thread(()->{
                System.out.println("t1 name "+Thread.currentThread().getName());
                System.out.println("t1 id "+Thread.currentThread().getId());
        });

        Thread t2= new Thread(()->{
            System.out.println("t2 name "+Thread.currentThread().getName());
            System.out.println("t2 id "+Thread.currentThread().getId());
        });

        t1.start();
        t2.start();
    }
}
