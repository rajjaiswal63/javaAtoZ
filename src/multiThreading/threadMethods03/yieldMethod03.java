package multiThreading.threadMethods03;

public class yieldMethod03 {
    public static void main(String[] args){

        //yield()  -- Thread.yield(); -- I am willing to my cpu to run other thread
        //OS can reject this, it is like a suggestion to the OS

        //Current Thread does not go to sleep, timeWaiting , timeBlocked, timeRunnable
        //it does go only runnable state


        Thread t1= new Thread(()-> {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) System.out.println("even : "+i);
                Thread.yield();
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) System.out.println("odd : "+i);
            }
        });

        t1.start();
        t2.start();
    }
}
