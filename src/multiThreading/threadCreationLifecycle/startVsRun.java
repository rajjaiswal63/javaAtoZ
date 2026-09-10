package multiThreading.threadCreationLifecycle;

public class startVsRun {
    public static void main(String[] args) {
        Thread t1= new Thread(()->{
            System.out.println("t1 name "+Thread.currentThread().getName());
            System.out.println("t1 id "+Thread.currentThread().getId());
        });
            t1.start(); //t1 name Thread-0 t1 id 28      create new thread
            t1.run(); //t1 name main t1 id 3            runs in the same thread or current thread

        // can we start a Thread twice -> NO
    }
}
