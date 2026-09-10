package multiThreading.javaLocks07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoOfReentrantLock01 {
    public static void main(String[] args) {
        res r=new res();
        Thread t1=new Thread(()->{
           r.fun();
        });

        Thread t2=new Thread(()->{
            r.fun();
        });

        Thread t3=new Thread(()->{
            r.fun();
        });

        Thread t4=new Thread(()->{
            r.fun();
        });

        Thread t5=new Thread(()->{
            r.fun();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("Main Thread is completed");
    }
}
class res {
    Lock lock= new ReentrantLock();
    void fun(){
        lock.lock();
        try {
            try {
                System.out.println("I am in " + Thread.currentThread().getName());
            } catch (Exception e) {
            }
            System.out.println("I am out " + Thread.currentThread().getName());
        }
        finally{
            lock.unlock();
        }
    }
}
