package multiThreading.threadMethods03;

public class daemonThread08 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            while(true) {
                System.out.println("Running...");
            }
        });
        t1.setDaemon(true);
        t1.start();

        Thread.sleep(2000);
    }
}
/*

   Daemon Threads --> Background running threads
   --> Stop immediately once main thread is completed

   Threads --> User threads, Daemon threads

    Garbage collection --> Daemon thread
*/
